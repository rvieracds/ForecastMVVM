package com.example.forecastmvvm.data.network.response

import android.os.Parcelable
import com.example.forecastmvvm.data.db.entity.CurrentWeatherEntry
import com.example.forecastmvvm.data.db.entity.Location
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CurrentWeatherResponse(
    val current: CurrentWeatherEntry,
    val location: Location
) : Parcelable