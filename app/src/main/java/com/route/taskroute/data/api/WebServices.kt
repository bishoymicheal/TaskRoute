package com.route.routetask.data.api


import com.route.taskroute.data.data_models.ProductsResponse
import retrofit2.http.GET

interface WebServices {
    @GET("products")
    suspend fun getProducts(): ProductsResponse
}