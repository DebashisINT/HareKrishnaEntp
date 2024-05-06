package com.breezefieldkrishnatea.features.location.api

import com.breezefieldkrishnatea.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldkrishnatea.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}