package com.practical.rahul.di

import android.app.Application
import android.content.Context
import com.practical.rahul.database.AppDatabase
import com.practical.rahul.database.category.CategoryMastersDAO
import com.practical.rahul.database.category.screenSaverMaster.ScreenSaverMastersDAO
import com.practical.rahul.database.categoryImages.CategoryImageDAO
import com.practical.rahul.database.categoryItemImage.ItemImagesDAO
import com.practical.rahul.database.categoryItems.CategoryItemsDAO
import com.practical.rahul.database.orders.OrdersDAO
import com.practical.rahul.extentions.HttpErrorInterceptor
import com.practical.rahul.network.ApiService
import com.practical.rahul.utils.Constant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {


    private val NETWORK_TIMEOUT = 10L

    @Provides
    fun providesBaseUrl(): String = Constant.BaseURL

    @Provides
    @Singleton
    fun getAppDB(context: Application): AppDatabase {
        return AppDatabase.getAppDB(context)
    }

    @Provides
    @Singleton
    fun getCategoryMastersDAO(appDb: AppDatabase): CategoryMastersDAO {
        return appDb.categoryMastersDAO()
    }

    @Provides
    @Singleton
    fun getCategoryImageDAO(appDb: AppDatabase): CategoryImageDAO {
        return appDb.categoryImageDAO()
    }


    @Provides
    @Singleton
    fun getScreenSaverMasterDAO(appDb: AppDatabase): ScreenSaverMastersDAO {
        return appDb.screenSaverMastersDAO()
    }



    @Provides
    @Singleton
    fun getItemImagesDAO(appDb: AppDatabase): ItemImagesDAO {
        return appDb.itemImagesDAO()
    }

    @Provides
    @Singleton
    fun getCategoryItemsDAO(appDb: AppDatabase): CategoryItemsDAO {
        return appDb.categoryItemsDAO()
    }

    @Provides
    @Singleton
    fun getOrdersDAO(appDb: AppDatabase): OrdersDAO {
        return appDb.ordersDAO()
    }

    @Provides
    @Singleton
    fun providesRetrofitBuilder(baseUrl: String, @ApplicationContext context: Context): Retrofit =
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(getClient(context).build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun providesApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private fun getClient(context: Context): OkHttpClient.Builder {
        return OkHttpClient.Builder().apply {
            addInterceptor(loggingInterceptor)
            addInterceptor { chain ->
                val request = chain.request().newBuilder()
                    .addHeader("Version", "1.0")
                chain.proceed(request.build())
            }
            connectTimeout(NETWORK_TIMEOUT, TimeUnit.MINUTES)
            readTimeout(NETWORK_TIMEOUT, TimeUnit.MINUTES)
            writeTimeout(NETWORK_TIMEOUT, TimeUnit.MINUTES)
            addInterceptor(HttpErrorInterceptor(context))
        }
    }
}

