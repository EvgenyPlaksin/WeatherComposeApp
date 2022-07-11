package com.lnight.weatherapp.domain.repository

import com.lnight.weatherapp.domain.util.Resource
import com.lnight.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}