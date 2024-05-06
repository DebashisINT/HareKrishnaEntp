package com.breezefieldkrishnatea.features.stockAddCurrentStock.api

import com.breezefieldkrishnatea.base.BaseResponse
import com.breezefieldkrishnatea.features.location.model.ShopRevisitStatusRequest
import com.breezefieldkrishnatea.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldkrishnatea.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldkrishnatea.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldkrishnatea.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}