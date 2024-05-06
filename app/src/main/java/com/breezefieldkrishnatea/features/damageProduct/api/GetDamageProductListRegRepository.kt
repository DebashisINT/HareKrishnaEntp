package com.breezefieldkrishnatea.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldkrishnatea.app.FileUtils
import com.breezefieldkrishnatea.base.BaseResponse
import com.breezefieldkrishnatea.features.NewQuotation.model.*
import com.breezefieldkrishnatea.features.addshop.model.AddShopRequestData
import com.breezefieldkrishnatea.features.addshop.model.AddShopResponse
import com.breezefieldkrishnatea.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldkrishnatea.features.damageProduct.model.delBreakageReq
import com.breezefieldkrishnatea.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldkrishnatea.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldkrishnatea.features.myjobs.model.WIPImageSubmit
import com.breezefieldkrishnatea.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}