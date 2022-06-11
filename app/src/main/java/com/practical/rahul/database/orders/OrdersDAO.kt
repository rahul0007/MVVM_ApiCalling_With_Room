package com.practical.rahul.database.orders

import androidx.room.*

@Dao
interface OrdersDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertItem(orders: Orders)

    @Update()
    fun updateItem(orders: Orders)

    @Delete()
    fun deleteItem(orders: Orders)

    @Query("select * from Orders WHERE CATEGORY_ID LIKE :catId AND ITEM_ID LIKE :itemId")
    fun getOrders(catId : String, itemId : String): Orders?

    @Query("select * from Orders")
    fun getAllOrders():List<Orders>

}