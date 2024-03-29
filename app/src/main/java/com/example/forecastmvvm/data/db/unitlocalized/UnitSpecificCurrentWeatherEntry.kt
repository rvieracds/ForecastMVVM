package com.example.forecastmvvm.data.db.unitlocalized

interface UnitSpecificCurrentWeatherEntry {
    val humidity: Int
    val lastUpdated: String
    val temperature: Double
    val conditionText: String
    val conditionIconUrl: String
    val windSpeed: Double
    val windDirection: String
    val precipitationVolume: Double
    val feelsLikeTemperature: Double
    val visibilityDistance: Double
}