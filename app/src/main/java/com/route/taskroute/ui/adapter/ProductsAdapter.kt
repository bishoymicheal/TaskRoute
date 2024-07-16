package com.route.taskroute.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder


import com.route.taskroute.data.data_models.ProductsItem
import com.route.taskroute.databinding.ProductLayoutBinding

class ProductsAdapter(
    private val productsList: List<ProductsItem?>
) :
    RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {
        val binding =
            ProductLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductsViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        holder.bind(productsList[position]!!)
    }

    override fun getItemCount(): Int = productsList.size

    class ProductsViewHolder(private val binding: ProductLayoutBinding) : ViewHolder(binding.root) {
        fun bind(product: ProductsItem) {
            binding.product = product
        }
    }
}