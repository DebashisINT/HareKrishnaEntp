package com.breezefieldkrishnatea.features.nearbyuserlist.api

import com.breezefieldkrishnatea.app.Pref
import com.breezefieldkrishnatea.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldkrishnatea.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldkrishnatea.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}