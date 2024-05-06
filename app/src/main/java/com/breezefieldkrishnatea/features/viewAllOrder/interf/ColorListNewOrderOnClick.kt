package com.breezefieldkrishnatea.features.viewAllOrder.interf

import com.breezefieldkrishnatea.app.domain.NewOrderColorEntity
import com.breezefieldkrishnatea.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}