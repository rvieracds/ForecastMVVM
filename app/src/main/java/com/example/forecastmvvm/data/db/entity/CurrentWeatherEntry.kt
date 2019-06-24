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
    val last_updated: String,
    val temp_c: Double,
    val temp_f: Double,
    val is_day: Int,
    @Embedded(prefix = "condition_")
    val condition: Condition,
    val wind_dir: String,
    val wind_kph: Double,
    val wind_mph: Double,
    val precip_in: Double,
    val precip_mm: Double,
    val feelslike_c: Double,
    val feelslike_f: Double,
    val vis_km: Double,
    val vis_miles: Double,
    val uv: Double
) : Parcelable {
    @PrimaryKey(autoGenerate = false)
    var id: Int = CURRENT_WEATHER_ID
}