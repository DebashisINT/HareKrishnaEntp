package com.breezefieldkrishnatea.features.survey.api

import com.breezefieldkrishnatea.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldkrishnatea.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}