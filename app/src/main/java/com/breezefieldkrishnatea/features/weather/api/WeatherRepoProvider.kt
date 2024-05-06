package com.breezefieldkrishnatea.features.weather.api

import com.breezefieldkrishnatea.features.task.api.TaskApi
import com.breezefieldkrishnatea.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}