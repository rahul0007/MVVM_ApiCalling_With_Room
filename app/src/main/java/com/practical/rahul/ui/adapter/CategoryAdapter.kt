package com.practical.rahul.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.practical.rahul.R
import com.practical.rahul.database.AppDatabase
import com.practical.rahul.database.category.CategoryMasters
import com.practical.rahul.database.categoryImages.CategoryImage
import com.practical.rahul.utils.Constant
import kotlinx.android.synthetic.main.row_category.view.*


class CategoryAdapter(
    var items: ArrayList<CategoryMasters>,
    var context: Context,
    var listner: OnItemClickStatusListener
) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    lateinit var view: View

    var appDatabase: AppDatabase? = null

    init {
        appDatabase = AppDatabase.getAppDB(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.ViewHolder {
        view = LayoutInflater.from(context).inflate(R.layout.row_category, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: CategoryAdapter.ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        @SuppressLint("CheckResult")
        fun bind(items: CategoryMasters) {


            val categoryImage: CategoryImage? = appDatabase?.categoryImageDAO()
                ?.getCategoryImages(items.CategoryID)

            Log.e("categoryImage","categoryImage: "+categoryImage?.ImageUrl)
            itemView.mainLayout.setOnClickListener {
                listner.CategoryItemsClicked(items)
            }
            itemView.textViewCategoryName.text=items.Name
            val requestOptions = RequestOptions()
            requestOptions.placeholder(R.drawable.ic_default_images)
            Glide.with(context)
                .setDefaultRequestOptions(requestOptions)
                .load(Constant.BaseURL+categoryImage?.ImageUrl)
                .apply(RequestOptions().transforms(CenterCrop(), RoundedCorners(20)))
                .into(itemView.imageViewCategory)
        }
    }

    interface OnItemClickStatusListener {

        fun CategoryItemsClicked(categoryMasters: CategoryMasters)

    }
}
