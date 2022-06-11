package com.practical.rahul.database.categoryImages

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CategoryImage")
class CategoryImage(){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    @ColumnInfo(name = "C_IMG_ID")
    var CImgID: String = ""
    @ColumnInfo(name = "CATEGORY_ID")
    var CategoryID: String = ""
    @ColumnInfo(name = "IMAGE_URL")
    var ImageUrl: String = ""

}