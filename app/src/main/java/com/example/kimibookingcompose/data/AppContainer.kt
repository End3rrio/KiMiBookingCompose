package com.example.kimibookingcompose.data

import com.example.kimibookingcompose.network.HotelService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface AppContainer {
    val hotelsRepository : HotelsRepository
}

class DefaultAppContainer : AppContainer {
    private val BASE_URL = "https://hotels-com-provider.p.rapidapi.com/v2/hotels/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    private  val retrofitService: HotelService by lazy {
        retrofit.create(HotelService::class.java)
    }

    override val hotelsRepository: HotelsRepository by lazy {
        NetworkHotelsRepository(retrofitService)
    }
}