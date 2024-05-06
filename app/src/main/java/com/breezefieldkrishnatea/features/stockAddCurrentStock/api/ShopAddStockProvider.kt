package com.breezefieldkrishnatea.features.stockAddCurrentStock.api

import com.breezefieldkrishnatea.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldkrishnatea.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}