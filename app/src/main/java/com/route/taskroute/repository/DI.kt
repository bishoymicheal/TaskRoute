package com.route.taskroute.data.repo




import com.route.taskroute.domain.repo.ProductsRepo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DI {
    @Provides
    fun provideProductsRepo(productsRepoImpl: ProductsRepoImpl): ProductsRepo = productsRepoImpl
}