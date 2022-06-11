package com.practical.rahul.ui.activity.screenSaver

import android.content.Context
import com.practical.rahul.database.category.screenSaverMaster.ScreenSaverMaster
import androidx.viewpager.widget.PagerAdapter
import android.view.LayoutInflater
import android.view.ViewGroup
import com.practical.rahul.R
import com.bumptech.glide.Glide
import android.os.Parcelable
import android.util.Log
import android.view.View
import android.widget.ImageView
import com.practical.rahul.utils.Constant

class ScreenSaverAdapter(
    private val context: Context,
    private val IMAGES: List<ScreenSaverMaster>,
    var listener: OnTapScreenSaverImage,

    ) : PagerAdapter() {
    private val inflater: LayoutInflater
    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View)
    }

    override fun getCount(): Int {
        return IMAGES.size
    }

    override fun instantiateItem(view: ViewGroup, position: Int): Any {
        val imageLayout = inflater.inflate(R.layout.slidingimages_layout, view, false)!!
        val imageView = imageLayout.findViewById<View>(R.id.imageViewScreenSaver) as ImageView
        Log.e("images", "images full path" + Constant.BaseURL + IMAGES[position].ImagePath)

        imageView.setOnClickListener {
            listener.onTap()
        }
        Glide.with(context)
            .load(Constant.BaseURL + IMAGES[position].ImagePath)
            .into(imageView)
        view.addView(imageLayout, 0)
        return imageLayout
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view == obj
    }

    override fun restoreState(state: Parcelable?, loader: ClassLoader?) {}
    override fun saveState(): Parcelable? {
        return null
    }

    init {
        inflater = LayoutInflater.from(context)
    }

    interface OnTapScreenSaverImage {
        fun onTap()
    }
}