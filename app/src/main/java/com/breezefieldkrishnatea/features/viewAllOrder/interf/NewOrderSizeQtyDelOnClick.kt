package com.breezefieldkrishnatea.features.viewAllOrder.interf

import com.breezefieldkrishnatea.app.domain.NewOrderGenderEntity
import com.breezefieldkrishnatea.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}