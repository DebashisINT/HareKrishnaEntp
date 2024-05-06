package com.breezefieldkrishnatea.features.viewAllOrder.interf

import com.breezefieldkrishnatea.app.domain.NewOrderGenderEntity
import com.breezefieldkrishnatea.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}