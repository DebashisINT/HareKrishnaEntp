package com.breezefieldkrishnatea.features.viewAllOrder.orderOptimized

import com.breezefieldkrishnatea.app.domain.ProductOnlineRateTempEntity
import com.breezefieldkrishnatea.base.BaseResponse
import com.breezefieldkrishnatea.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}