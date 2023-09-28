package com.example.kimibookingcompose

import android.app.Application
import com.example.kimibookingcompose.data.AppContainer
import com.example.kimibookingcompose.data.DefaultAppContainer

class HotelApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}