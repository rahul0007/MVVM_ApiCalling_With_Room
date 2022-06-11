package com.practical.rahul.database

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
import javax.inject.Inject

class RoomRepository @Inject constructor(
    private val categoryMastersDAO: CategoryMastersDAO,
    private val categoryImageDAO: CategoryImageDAO,
    private val screenSaverMastersDAO: ScreenSaverMastersDAO,
    private val categoryItemsDAO: CategoryItemsDAO,
    private val itemImagesDAO: ItemImagesDAO,
    private val ordersDAO: OrdersDAO,
    private val appDatabase: AppDatabase

) {

    fun getCategory(): List<CategoryMasters> {
        return categoryMastersDAO.readCategory()
    }

    fun clearAllTables() {
        appDatabase.clearAllTables()
    }

    fun insertCategory(categoryMasters: CategoryMasters) {
        categoryMastersDAO.saveCategory(categoryMasters)
    }

    fun insertCategoryImages(categoryImage: CategoryImage) {
        categoryImageDAO.insertCategoryImage(categoryImage)
    }

    fun insertCategoryItems(categoryItems: CategoryItems) {
        categoryItemsDAO.insertCategoryItems(categoryItems)
    }

    fun insertCategoryItemImage(itemImage: ItemImage) {
        itemImagesDAO.insertItemsImages(itemImage)
    }

    fun insertScreenSaverImages(screenSaverMaster: ScreenSaverMaster) {
        screenSaverMastersDAO.insertScreenSaverImage(screenSaverMaster)
    }

    fun getScreenSaverImages(): List<ScreenSaverMaster> {
        return screenSaverMastersDAO.getScreenSaverImages()
    }


    fun getCategoryItems(): List<CategoryItems> {
        return categoryItemsDAO.getCategoryItems()
    }

    fun addItemsOrder(orders: Orders) {
        ordersDAO.insertItem(orders)
    }

    fun updatesItemsOrder(orders: Orders) {
        ordersDAO.updateItem(orders)
    }

    fun getOrders(catId : String, itemId : String): Orders? {
        return ordersDAO.getOrders(catId,itemId)
    }

    fun getAllOrders(): List<Orders?> {
        return ordersDAO.getAllOrders()
    }

    fun getDeleteOrders(orders: Orders){
         ordersDAO.deleteItem(orders)
    }
}