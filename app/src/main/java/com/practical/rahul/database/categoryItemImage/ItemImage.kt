package com.practical.rahul.database.categoryItemImage

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ItemImages")
class ItemImage(){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    @ColumnInfo(name = "IMG_ID")
    var IImgID: String = ""
    @ColumnInfo(name = "IMG_URL")
    var ImageUrl: String = ""
    @ColumnInfo(name = "ITEM_ID")
    var ItemID: String = ""

}