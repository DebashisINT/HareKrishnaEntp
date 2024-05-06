package com.breezefieldkrishnatea.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldkrishnatea.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldkrishnatea.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}