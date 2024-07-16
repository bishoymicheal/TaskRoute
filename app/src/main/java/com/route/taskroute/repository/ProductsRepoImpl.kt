package com.route.taskroute.data.repo



import com.route.taskroute.data.data_sources.remote.RemoteDataSource
import com.route.taskroute.data.data_models.ProductsItem

import com.route.taskroute.domain.repo.ProductsRepo
import javax.inject.Inject

class ProductsRepoImpl @Inject constructor(private val remoteDS: RemoteDataSource) : ProductsRepo {
    override suspend fun getProducts(): List<ProductsItem?>? {
        return remoteDS.getProducts()
    }

}