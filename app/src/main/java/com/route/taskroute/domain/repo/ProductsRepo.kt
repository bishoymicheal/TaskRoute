package com.route.taskroute.domain.repo


import com.route.taskroute.data.data_models.ProductsItem

interface ProductsRepo {
   suspend fun getProducts() : List<ProductsItem?>?
}