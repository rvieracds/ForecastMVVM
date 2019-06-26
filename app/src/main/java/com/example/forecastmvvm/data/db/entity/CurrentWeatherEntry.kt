package com.example.forecastmvvm.data.db.entity

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

const val CURRENT_WEATHER_ID = 0

@Parcelize
@Entity(tableName = "current_weather")
data class CurrentWeatherEntry(
    val humidity: Int,
    val lastUpdated: String,
    val tempC: Double,
    val tempF: Double,
    val isDay: Int,
    @Embedded(prefix = "condition_")
    val condition: Condition,
    val windMph: Double,
    val windKph: Double,
    val windDir: String,
    val precipMm: Double,
    val precipIn: Double,
    val feelslikeC: Double,
    val feelslikeF: Double,
    val visKm: Double,
    val visMiles: Double
) : Parcelable {
    @PrimaryKey(autoGenerate = false)
    var id: Int = CURRENT_WEATHER_ID
}