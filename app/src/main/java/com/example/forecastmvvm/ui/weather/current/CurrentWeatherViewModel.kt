package com.example.forecastmvvm.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.example.forecastmvvm.data.repository.ForecastRepository

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository
) : ViewModel() {
    private val unitSystem = "metric"

    val isMetric: Boolean
        get() = true

    val weather = forecastRepository.getCurrentWeather()
}
