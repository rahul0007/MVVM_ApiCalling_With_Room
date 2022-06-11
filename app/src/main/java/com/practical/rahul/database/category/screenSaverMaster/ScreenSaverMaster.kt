package com.practical.rahul.database.category.screenSaverMaster
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ScreenSaverMaster")
class ScreenSaverMaster(){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    @ColumnInfo(name = "ScreenSaverID")
    var ScreenSaverID: String = ""
    @ColumnInfo(name = "ImagePath")
    var ImagePath: String = ""

}