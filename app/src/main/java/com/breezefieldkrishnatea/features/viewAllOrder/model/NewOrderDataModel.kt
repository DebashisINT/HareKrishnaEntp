package com.breezefieldkrishnatea.features.viewAllOrder.model

import com.breezefieldkrishnatea.app.domain.NewOrderColorEntity
import com.breezefieldkrishnatea.app.domain.NewOrderGenderEntity
import com.breezefieldkrishnatea.app.domain.NewOrderProductEntity
import com.breezefieldkrishnatea.app.domain.NewOrderSizeEntity
import com.breezefieldkrishnatea.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

