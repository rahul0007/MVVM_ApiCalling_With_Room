package com.practical.rahul.ui.activity.home
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.practical.rahul.R
import com.practical.rahul.database.category.CategoryMasters
import com.practical.rahul.database.categoryItemImage.ItemImage
import com.practical.rahul.database.categoryItems.CategoryItems
import com.practical.rahul.extentions.manageLoading
import com.practical.rahul.ui.adapter.CategoryAdapter
import com.practical.rahul.ui.adapter.CategoryProductAdapter
import com.practical.rahul.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity(), CategoryAdapter.OnItemClickStatusListener,
    CategoryProductAdapter.OnItemClickProductListener,
    View.OnClickListener {
    var categoryMasters: CategoryMasters?=null
    lateinit var homeViewModel: HomeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun findFragmentPlaceHolder() = 0

    override fun findContentView() = R.layout.activity_home

    override fun observeViewModel() {
        setOnClickListener()
        homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        homeViewModel.getCategory()
        homeViewModel.manageLoading(
            this, this,
            homeViewModel.getCategoryDelegate,
            homeViewModel.errorLiveData
        ).getCategory()

        homeViewModel.getCategoryDelegate.observe(this) {
            Log.e("getCategoryDelegate", "getCategoryDelegate ::::" + it.size)
            val adapter = CategoryAdapter(it as ArrayList<CategoryMasters>, this, this)
            recyclerViewCategories.adapter = adapter

        }

        homeViewModel.delegatesMessage.observe(this) {
            Toast.makeText(this, ""+it, Toast.LENGTH_SHORT).show()
        }


        homeViewModel.categoryItemsDelegates.observe(this) {
            val adapter = CategoryProductAdapter(it, this, this)
            recyclerViewItems.adapter = adapter

        }
    }

    companion object {
        fun start(context: BaseActivity) {
            val intent = Intent(context, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            context.startActivity(intent)
        }
    }

    override fun CategoryItemsClicked(categoryMasters: CategoryMasters) {
        this.categoryMasters=categoryMasters
        homeViewModel.getCategoryItems()
    }

    override fun ProductItemsClicked(categoryItems: CategoryItems, itemImage: ItemImage) {
        homeViewModel.addProductInCartToCart(categoryItems, itemImage,categoryMasters!!)
    }


    private fun setOnClickListener() {
        buttonCheckOut.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.buttonCheckOut -> {
            }
        }
    }
}