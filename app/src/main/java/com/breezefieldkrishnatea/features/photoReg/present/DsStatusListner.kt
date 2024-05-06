package com.breezefieldkrishnatea.features.photoReg.present

import com.breezefieldkrishnatea.app.domain.ProspectEntity
import com.breezefieldkrishnatea.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}