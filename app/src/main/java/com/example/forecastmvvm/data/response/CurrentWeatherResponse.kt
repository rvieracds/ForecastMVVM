package com.example.forecastmvvm.data.response

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CurrentWeatherResponse(
    val current: CurrentWeatherEntry,
    val location: Location
) : Parcelable