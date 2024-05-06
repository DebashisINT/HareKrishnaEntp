package com.breezefieldkrishnatea.features.login.model.productlistmodel

import com.breezefieldkrishnatea.app.domain.NewOrderScrOrderEntity
import com.breezefieldkrishnatea.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}