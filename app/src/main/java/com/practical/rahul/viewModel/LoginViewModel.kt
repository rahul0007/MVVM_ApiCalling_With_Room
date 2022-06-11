package com.practical.rahul.viewModel

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.practical.rahul.database.RoomRepository
import com.practical.rahul.database.category.CategoryMasters
import com.practical.rahul.database.category.screenSaverMaster.ScreenSaverMaster
import com.practical.rahul.database.categoryImages.CategoryImage
import com.practical.rahul.database.categoryItemImage.ItemImage
import com.practical.rahul.database.categoryItems.CategoryItems
import com.practical.rahul.extentions.manageNetwork
import com.practical.rahul.lifecycle.ErrorModelView
import com.practical.rahul.lifecycle.SingleLiveData
import com.practical.rahul.model.DelegateModel
import com.practical.rahul.model.request.LoginRequest
import com.practical.rahul.model.response.*
import com.practical.rahul.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val repository: Repository,
    private val roomRepository: RoomRepository,
    @ApplicationContext val context: Context,
) : ViewModel() {
    var delegateLogin = SingleLiveData<DelegateModel?>()
    val errorLiveData: SingleLiveData<ErrorModelView> = SingleLiveData()
    var exceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
        errorLiveData.postValue(
            ErrorModelView(
                messageTitle = throwable.message,
                tagException = throwable.printStackTrace().toString()
            )
        )
    }

    fun getLogin(email: String, password: String) {
        val loginRequest = LoginRequest()
        loginRequest.Username = email
        loginRequest.password = password
        viewModelScope.manageNetwork(context, exceptionHandler)
            ?.launch(exceptionHandler) {
                withContext(Dispatchers.IO) {
                    repository.getLogin(loginRequest).apply {
                        insertCateGory(this.categoryMasters)
                        insertCateGoryImages(this.categoryImages)
                        insertScreenSaverImage(this.screenSaverMasters)
                        insertCateGoryItems(this.items)
                        insertCateGoryItemsImage(this.itemImages)
                        this.screenSaverMasters.forEach {
                            Log.e("screenSaverMasters", "imagePath --> " + it.imagePath)
                        }
                        delegateLogin.postValue(DelegateModel("success", true))
                    }
                }
            }
    }


    private fun insertScreenSaverImage(categoryList: List<ScreenSaverMastersItem>) {
        categoryList.forEach {
            val screenSaverMaster = ScreenSaverMaster()
            screenSaverMaster.ImagePath = it.imagePath
            screenSaverMaster.ScreenSaverID = it.screenSaverID
            roomRepository.insertScreenSaverImages(screenSaverMaster)
        }
    }

    private fun insertCateGory(categoryList: List<CategoryMastersItem>) {
        roomRepository.clearAllTables()
        categoryList.forEach {
            val cat = CategoryMasters()
            cat.CategoryID = it.categoryID
            cat.Description = it.description
            cat.Name = it.name
            cat.BackgroundImage = it.backgroundImage
            roomRepository.insertCategory(cat)
        }
    }


    private fun insertCateGoryImages(imageList: List<CategoryImagesItem>) {
        imageList.forEach {
            Log.e("imageUrl", "imageUrl-->" + it.imageUrl)
            val categoryImage = CategoryImage()
            categoryImage.ImageUrl = it.imageUrl
            categoryImage.CImgID = it.cImgID
            categoryImage.CategoryID = it.categoryID
            roomRepository.insertCategoryImages(categoryImage)
        }
    }

    private fun insertCateGoryItems(imageList: List<ItemsItem>) {
        imageList.forEach {
            var item = CategoryItems()
            item.Name = it.name
            item.ItemID = it.itemID
            item.Price = it.price
            item.FullDescription = it.fullDescription
            roomRepository.insertCategoryItems(item)
        }
    }

    private fun insertCateGoryItemsImage(imageList: List<ItemImagesItem>) {
        imageList.forEach {
            var item = ItemImage()
            item.ItemID = it.itemID
            item.ImageUrl = it.imageUrl
            roomRepository.insertCategoryItemImage(item)
        }
    }
}