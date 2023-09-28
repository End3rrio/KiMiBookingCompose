package com.example.kimibookingcompose.data

import com.example.kimibookingcompose.network.HotelService
import retrofit2.http.Query

interface HotelsRepository {
    suspend fun getHotel(locale: String, domain: String, hotel_id: Int ): List<Hotel>
}

class NetworkHotelsRepository(
    private val hotelService: HotelService
) : HotelsRepository {
    override suspend fun getHotel(
        locale: String,
        domain: String,
        hotel_id: Int
    ): List<Hotel>
    {
        val Hotel1 = Hotel (
            name = hotelService.hotelSearch(locale, domain, hotel_id).summary?.name,
            tagline = hotelService.hotelSearch(locale, domain, hotel_id).summary?.tagline.toString(),
            address = hotelService.hotelSearch(locale, domain, hotel_id).summary?.location?.address?.addressLine.toString()
        )
        val hotelList = listOf(Hotel1)
        hotelList.toMutableList()
        return hotelList
    }
}