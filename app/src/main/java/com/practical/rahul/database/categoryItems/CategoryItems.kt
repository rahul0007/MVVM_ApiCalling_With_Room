package com.practical.rahul.database.categoryItems
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CategoryItems")
class CategoryItems(){

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    @ColumnInfo(name = "NAME")
    var Name: String = ""

    @ColumnInfo(name = "ITEM_ID")
    var ItemID: String = ""

    @ColumnInfo(name = "FULL_DESCRIPTION")
    var FullDescription: String = ""

    @ColumnInfo(name = "PRICE")
    var Price: String = ""
}