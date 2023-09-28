package com.example.kimibookingcompose.network

import com.example.kimibookingcompose.Hotel
import retrofit2.http.GET
import retrofit2.http.Query

interface HotelService {
    @GET("details")
    suspend fun hotelSearch(
        @Query("locale") searchLocale: String,
        @Query("domain") searchDomain: String,
        @Query("hotel_id") searchHotelById: Int,
    ): Hotel
}