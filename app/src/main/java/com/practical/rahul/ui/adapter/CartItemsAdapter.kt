package com.practical.rahul.ui.adapter

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
import com.practical.rahul.database.orders.Orders
import com.practical.rahul.utils.Constant
import com.practical.rahul.utils.NumberCounterButton
import kotlinx.android.synthetic.main.row_cart_items.view.*

class CartItemsAdapter(val context: Context, var orderList: List<Orders?>,var listener:OnCartValueChangeListener) :
    RecyclerView.Adapter<CartItemsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.row_cart_items, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: CartItemsAdapter.ViewHolder, position: Int) {
        holder.bind(orderList[position]!!)
    }

    override fun getItemCount(): Int {
        return orderList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(items: Orders) {
            val totalPrice = items.QUANTITY.toFloat() * items.ItemPrice.toFloat()
            itemView.textViewItemsName.text = items.ItemName
            itemView.textViewPrice.text = "" + totalPrice
            itemView.numberCounter.number = "" + items.QUANTITY
            itemView.numberCounter.setOnValueChangeListener(object : NumberCounterButton.OnValueChangeListener {
                override fun onValueChange(
                    view: NumberCounterButton?,
                    oldValue: Int,
                    newValue: Int
                ) {

                    listener.incrementQty(newValue,items)
                }

            })

            itemView.imageViewDelete.setOnClickListener {
                listener.deleteOrder(items)
            }
            val requestOptions = RequestOptions()
            requestOptions.placeholder(R.drawable.ic_default_images)
            Glide.with(context)
                .setDefaultRequestOptions(requestOptions)
                .load(Constant.BaseURL + items.ItemImageUrl)
                .apply(RequestOptions().transforms(CenterCrop(), RoundedCorners(20)))
                .into(itemView.imageViewProduct)
        }
    }
interface OnCartValueChangeListener
{
    fun incrementQty(qty:Int,items: Orders)
    fun deleteOrder(items: Orders)
}
}