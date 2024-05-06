package com.breezefieldkrishnatea.features.photoReg.model

import com.breezefieldkrishnatea.features.stockAddCurrentStock.model.CurrentStockGetDataDtls

class GetUserListResponse {
    var status:String ? = null
    var message:String ? = null
    var user_list :ArrayList<UserListResponseModel>? = null
}