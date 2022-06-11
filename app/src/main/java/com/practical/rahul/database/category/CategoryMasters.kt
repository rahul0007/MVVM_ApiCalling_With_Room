package com.practical.rahul.database.category
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CategoryMasters")
class CategoryMasters(){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    @ColumnInfo(name = "CATEGORY_ID")
    var CategoryID: String = ""
    @ColumnInfo(name = "DESCRIPTION")
    var Description: String = ""
    @ColumnInfo(name = "NAME")
    var Name: String = ""
    @ColumnInfo(name = "BACKGROUND_IMAGE")
    var BackgroundImage: String = ""
}