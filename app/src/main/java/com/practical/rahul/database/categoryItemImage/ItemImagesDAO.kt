package com.practical.rahul.database.categoryItemImage

import androidx.room.*

@Dao
interface ItemImagesDAO{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertItemsImages(itemImage: ItemImage)

    @Query("select * from ItemImages where ITEM_ID=:strId")
    fun getItemsImages(strId: String): ItemImage
}