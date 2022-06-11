package com.practical.rahul.database.categoryItems

import androidx.room.*

@Dao
interface CategoryItemsDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCategoryItems(categoryItems: CategoryItems)

    @Query("select * from CategoryItems")
    fun getCategoryItems(): List<CategoryItems>

    @Query("select * from CategoryItems where ITEM_ID=:strId ")
    fun getItemsImages(strId: String): List<CategoryItems>

}