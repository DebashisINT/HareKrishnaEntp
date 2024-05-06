package com.breezefieldkrishnatea.features.viewAllOrder.interf

import com.breezefieldkrishnatea.app.domain.NewOrderProductEntity
import com.breezefieldkrishnatea.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}