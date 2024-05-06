package com.breezefieldkrishnatea.features.location.shopRevisitStatus

import com.breezefieldkrishnatea.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldkrishnatea.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}