package com.breezefieldkrishnatea.features.document.api

import com.breezefieldkrishnatea.features.dymanicSection.api.DynamicApi
import com.breezefieldkrishnatea.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}