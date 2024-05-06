package com.breezefieldkrishnatea.features.login.model.productlistmodel

import com.breezefieldkrishnatea.app.domain.ModelEntity
import com.breezefieldkrishnatea.app.domain.ProductListEntity
import com.breezefieldkrishnatea.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}