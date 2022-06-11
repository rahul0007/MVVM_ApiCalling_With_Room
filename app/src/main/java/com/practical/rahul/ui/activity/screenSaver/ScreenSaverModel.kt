package com.practical.rahul.ui.activity.screenSaver

import android.content.Context
import androidx.lifecycle.ViewModel
import com.practical.rahul.database.RoomRepository
import com.practical.rahul.database.category.screenSaverMaster.ScreenSaverMaster
import com.practical.rahul.lifecycle.ErrorModelView
import com.practical.rahul.lifecycle.SingleLiveData
import com.practical.rahul.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class ScreenSaverModel @Inject constructor(
    private val repository: Repository,
    private val roomRepository: RoomRepository,
    @ApplicationContext val context: Context,
) : ViewModel() {
    var screenSaverImageDelegate = SingleLiveData<List<ScreenSaverMaster>>()
    val errorLiveData: SingleLiveData<ErrorModelView> = SingleLiveData()
    fun getScreenSaverImages() {
        screenSaverImageDelegate.postValue(roomRepository.getScreenSaverImages())
    }
}