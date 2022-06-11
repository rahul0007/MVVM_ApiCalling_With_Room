package com.practical.rahul.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.practical.rahul.database.category.CategoryMasters
import com.practical.rahul.database.category.CategoryMastersDAO
import com.practical.rahul.database.category.screenSaverMaster.ScreenSaverMaster
import com.practical.rahul.database.category.screenSaverMaster.ScreenSaverMastersDAO
import com.practical.rahul.database.categoryImages.CategoryImage
import com.practical.rahul.database.categoryImages.CategoryImageDAO
import com.practical.rahul.database.categoryItemImage.ItemImage
import com.practical.rahul.database.categoryItemImage.ItemImagesDAO
import com.practical.rahul.database.categoryItems.CategoryItems
import com.practical.rahul.database.categoryItems.CategoryItemsDAO
import com.practical.rahul.database.orders.Orders
import com.practical.rahul.database.orders.OrdersDAO


@Database(entities = arrayOf((ScreenSaverMaster::class),(CategoryMasters::class),(CategoryImage::class),(CategoryItems::class),(ItemImage::class),(Orders::class)), version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun categoryMastersDAO(): CategoryMastersDAO
    abstract fun categoryImageDAO(): CategoryImageDAO
    abstract fun screenSaverMastersDAO(): ScreenSaverMastersDAO
    abstract fun categoryItemsDAO(): CategoryItemsDAO
    abstract fun itemImagesDAO(): ItemImagesDAO
    abstract fun ordersDAO(): OrdersDAO

    companion object {
        private var dbInstance: AppDatabase? = null

        fun getAppDB(context: Context): AppDatabase {
            if (dbInstance == null) {
                dbInstance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "GrubberDB"
                )
                    .allowMainThreadQueries()
                    .build()
            }
            return dbInstance!!
        }
    }
}