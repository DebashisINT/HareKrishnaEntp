package com.breezefieldkrishnatea.features.viewAllOrder.interf

import com.breezefieldkrishnatea.app.domain.NewOrderGenderEntity
import com.breezefieldkrishnatea.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}