package com.breezefieldkrishnatea.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldkrishnatea.app.Pref
import com.breezefieldkrishnatea.base.BaseResponse
import com.breezefieldkrishnatea.features.dashboard.presentation.model.DaystartDayendRequest
import com.breezefieldkrishnatea.features.dashboard.presentation.model.StatusDayStartEnd
import com.breezefieldkrishnatea.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldkrishnatea.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }

    fun daystartendDelete(sessionToken:String,usrID:String,date:String,dayStDel:String,dayEndDel:String): Observable<BaseResponse> {
        return apiService.submitDayStartEndDelApi(sessionToken,usrID,date,dayStDel,dayEndDel)
    }


}