package com.practical.rahul.database.orders

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Orders")
class Orders(){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    @ColumnInfo(name = "ITEM_ID")
    var ItemID: String = ""

    @ColumnInfo(name = "ITEM_NAME")
    var ItemName: String = ""

    @ColumnInfo(name = "ITEM_IMAGE_URL")
    var ItemImageUrl: String = ""

    @ColumnInfo(name = "CATEGORY_ID")
    var CategoryID: String = ""


    @ColumnInfo(name = "ITEM_PRICE")
    var ItemPrice: String = ""

    @ColumnInfo(name = "QUANTITY")
    var QUANTITY: Int = 1


}