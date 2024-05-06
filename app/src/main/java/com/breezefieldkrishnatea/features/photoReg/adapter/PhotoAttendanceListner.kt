package com.breezefieldkrishnatea.features.photoReg.adapter

import com.breezefieldkrishnatea.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}