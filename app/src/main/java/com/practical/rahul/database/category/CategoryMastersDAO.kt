package com.practical.rahul.database.category

import androidx.room.*

@Dao
interface CategoryMastersDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveCategory(categoryMasters: CategoryMasters)

    @Query("select * from CategoryMasters")
    fun readCategory(): List<CategoryMasters>

}