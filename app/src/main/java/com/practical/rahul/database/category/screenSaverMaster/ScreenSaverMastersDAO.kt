package com.practical.rahul.database.category.screenSaverMaster

import androidx.room.*

@Dao
interface ScreenSaverMastersDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertScreenSaverImage(screenSaverMaster: ScreenSaverMaster)

    @Query("select * from ScreenSaverMaster")
    fun getScreenSaverImages(): List<ScreenSaverMaster>

}