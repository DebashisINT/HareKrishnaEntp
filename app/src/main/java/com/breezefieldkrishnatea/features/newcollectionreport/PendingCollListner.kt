package com.breezefieldkrishnatea.features.newcollectionreport

import com.breezefieldkrishnatea.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}