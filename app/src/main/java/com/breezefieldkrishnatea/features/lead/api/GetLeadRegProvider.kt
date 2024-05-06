package com.breezefieldkrishnatea.features.lead.api

import com.breezefieldkrishnatea.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldkrishnatea.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}