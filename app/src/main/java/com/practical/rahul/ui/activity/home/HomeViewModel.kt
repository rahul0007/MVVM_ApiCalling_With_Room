package com.practical.rahul.ui.activity.home
import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import com.practical.rahul.database.RoomRepository
import com.practical.rahul.database.category.CategoryMasters
import com.practical.rahul.database.categoryItemImage.ItemImage
import com.practical.rahul.database.categoryItems.CategoryItems
import com.practical.rahul.database.orders.Orders
import com.practical.rahul.lifecycle.ErrorModelView
import com.practical.rahul.lifecycle.SingleLiveData
import com.practical.rahul.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineExceptionHandler
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: Repository,
    private val roomRepository: RoomRepository,
    @ApplicationContext val context: Context,
) : ViewModel() {
    var getCategoryDelegate = SingleLiveData<List<CategoryMasters>>()
    var categoryItemsDelegates = SingleLiveData<List<CategoryItems>>()
    var delegatesMessage = SingleLiveData<String>()
    val errorLiveData: SingleLiveData<ErrorModelView> = SingleLiveData()
    var exceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
        errorLiveData.postValue(
            ErrorModelView(
                messageTitle = throwable.message,
                tagException = throwable.printStackTrace().toString()
            )
        )
    }

    fun getCategory() {

        getCategoryDelegate.postValue(roomRepository.getCategory())
    }

    fun getCategoryItems() {
        categoryItemsDelegates.postValue(roomRepository.getCategoryItems())
    }

    fun addProductInCartToCart(
        item: CategoryItems,
        itemImage: ItemImage,
        categoryMasters: CategoryMasters) {
//cat 12.36 it=19249 no vg dish
        var getOrderData : Orders?=roomRepository.getOrders(categoryMasters.CategoryID,""+item.ItemID)
        if(getOrderData==null)
        {
            Log.e("orders:::","empty")
            val orderItem = Orders()
            orderItem.ItemID = "" + item.ItemID
            orderItem.ItemName = item.Name
            orderItem.ItemImageUrl = itemImage.ImageUrl
            orderItem.ItemPrice = item.Price
            orderItem.CategoryID = categoryMasters.CategoryID
            orderItem.QUANTITY = 1
            roomRepository.addItemsOrder(orderItem)
            delegatesMessage.postValue("Success")


        }
        else
        {
            Log.e("orders:::","not empty")
            var qty=getOrderData.QUANTITY+1;
            getOrderData.QUANTITY=qty
            roomRepository.updatesItemsOrder(getOrderData)
            delegatesMessage.postValue("Success update")
        }

    }



}