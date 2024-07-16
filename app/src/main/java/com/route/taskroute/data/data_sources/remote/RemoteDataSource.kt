package com.route.taskroute.data.data_sources.remote


import com.route.taskroute.data.data_models.ProductsItem

interface RemoteDataSource {
    suspend fun getProducts(): List<ProductsItem?>?
}