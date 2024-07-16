package com.route.routetask.domain.use_cases


import com.route.taskroute.data.data_models.ProductsItem
import com.route.taskroute.domain.repo.ProductsRepo
import javax.inject.Inject

class ProductsUseCase @Inject constructor(private val productsRepo: ProductsRepo){
    suspend fun execute(): List<ProductsItem?>? {
       return productsRepo.getProducts()
    }
}