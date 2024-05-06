package com.breezefieldkrishnatea.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldkrishnatea.app.FileUtils
import com.breezefieldkrishnatea.app.Pref
import com.breezefieldkrishnatea.base.BaseResponse
import com.breezefieldkrishnatea.features.addshop.model.AddLogReqData
import com.breezefieldkrishnatea.features.addshop.model.AddShopRequestData
import com.breezefieldkrishnatea.features.addshop.model.AddShopResponse
import com.breezefieldkrishnatea.features.addshop.model.LogFileResponse
import com.breezefieldkrishnatea.features.addshop.model.UpdateAddrReq
import com.breezefieldkrishnatea.features.contacts.CallHisDtls
import com.breezefieldkrishnatea.features.contacts.CompanyReqData
import com.breezefieldkrishnatea.features.contacts.ContactMasterRes
import com.breezefieldkrishnatea.features.contacts.SourceMasterRes
import com.breezefieldkrishnatea.features.contacts.StageMasterRes
import com.breezefieldkrishnatea.features.contacts.StatusMasterRes
import com.breezefieldkrishnatea.features.contacts.TypeMasterRes
import com.breezefieldkrishnatea.features.dashboard.presentation.DashboardActivity
import com.breezefieldkrishnatea.features.login.model.WhatsappApiData
import com.breezefieldkrishnatea.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}