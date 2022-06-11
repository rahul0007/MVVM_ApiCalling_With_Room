package com.practical.rahul.ui.activity.screenSaver

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.practical.rahul.R
import com.practical.rahul.extentions.manageLoading
import com.practical.rahul.ui.activity.home.HomeActivity
import com.practical.rahul.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_screen_saver.*

class ScreenSaverActivity : BaseActivity() {
    lateinit var screenSaverModel: ScreenSaverModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun findFragmentPlaceHolder() = 0
    override fun findContentView() = R.layout.activity_screen_saver
    override fun observeViewModel() {
        screenSaverModel = ViewModelProvider(this)[ScreenSaverModel::class.java]
        screenSaverModel.manageLoading(
            this, this,
            screenSaverModel.screenSaverImageDelegate,
            screenSaverModel.errorLiveData
        ).getScreenSaverImages()

        screenSaverModel.screenSaverImageDelegate.observe(this) {
            Log.e("image size", "totalSize${it.size}")
            pager.adapter = ScreenSaverAdapter(this, it,object:ScreenSaverAdapter.OnTapScreenSaverImage{
                override fun onTap() {
                    HomeActivity.start(this@ScreenSaverActivity)
                }
            })
        }
    }


    companion object {
        fun start(context: BaseActivity) {
            val intent = Intent(context, ScreenSaverActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            context.startActivity(intent)
        }
    }
}