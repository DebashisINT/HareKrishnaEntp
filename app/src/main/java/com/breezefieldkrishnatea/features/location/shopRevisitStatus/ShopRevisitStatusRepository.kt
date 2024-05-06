package com.breezefieldkrishnatea.features.location.shopRevisitStatus

import com.breezefieldkrishnatea.base.BaseResponse
import com.breezefieldkrishnatea.features.location.model.ShopDurationRequest
import com.breezefieldkrishnatea.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}