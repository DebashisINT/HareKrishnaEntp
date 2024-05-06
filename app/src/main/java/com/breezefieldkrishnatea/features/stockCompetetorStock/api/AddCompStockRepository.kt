package com.breezefieldkrishnatea.features.stockCompetetorStock.api

import com.breezefieldkrishnatea.base.BaseResponse
import com.breezefieldkrishnatea.features.orderList.model.NewOrderListResponseModel
import com.breezefieldkrishnatea.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldkrishnatea.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}