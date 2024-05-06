package com.breezefieldkrishnatea.features.weather.api

import com.breezefieldkrishnatea.base.BaseResponse
import com.breezefieldkrishnatea.features.task.api.TaskApi
import com.breezefieldkrishnatea.features.task.model.AddTaskInputModel
import com.breezefieldkrishnatea.features.weather.model.ForeCastAPIResponse
import com.breezefieldkrishnatea.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}