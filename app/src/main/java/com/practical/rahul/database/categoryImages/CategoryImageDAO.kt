package com.practical.rahul.database.categoryImages

import androidx.room.*

@Dao
interface CategoryImageDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCategoryImage(categoryImage: CategoryImage)

    @Query("select * from CategoryImage where CATEGORY_ID=:cateID")
    fun getCategoryImages(cateID: String): CategoryImage
}