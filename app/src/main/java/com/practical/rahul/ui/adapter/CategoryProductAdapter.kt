package com.practical.rahul.ui.adapter
import android.annotation.SuppressLint
import android.content.Context
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
import com.practical.rahul.database.categoryItemImage.ItemImage
import com.practical.rahul.database.categoryItems.CategoryItems
import com.practical.rahul.utils.Constant
import kotlinx.android.synthetic.main.row_category_product_item.view.*


class CategoryProductAdapter(var items: List<CategoryItems>, var context: Context, var listner: OnItemClickProductListener) : RecyclerView.Adapter<CategoryProductAdapter.ViewHolder>() {

    lateinit var view: View
    var appDatabase: AppDatabase? = null

    init {
        appDatabase = AppDatabase.getAppDB(context)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryProductAdapter.ViewHolder {
        view = LayoutInflater.from(context).inflate(R.layout.row_category_product_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: CategoryProductAdapter.ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        @SuppressLint("CheckResult")
        fun bind(items: CategoryItems) {
            var cateItemImage: ItemImage? = appDatabase?.itemImagesDAO()!!.getItemsImages(items.ItemID)

            itemView.mainLayout.setOnClickListener {
                listner.ProductItemsClicked(items,cateItemImage!!)
            }
            itemView.textViewName.text = items.Name
            itemView.textViewPrice.text = "$"+items.Price
            val requestOptions = RequestOptions()
            requestOptions.placeholder(R.drawable.ic_default_images)
            requestOptions.error(R.drawable.ic_default_images)
            Glide.with(context)
                    .setDefaultRequestOptions(requestOptions)
                    .load(Constant.BaseURL+cateItemImage?.ImageUrl)
                    .apply(RequestOptions().transforms(CenterCrop(), RoundedCorners(20)))
                    .into(itemView.imageViewCategory)
        }
    }

    interface OnItemClickProductListener {

        fun ProductItemsClicked(categoryItems: CategoryItems,itemImage:ItemImage)

    }
}
