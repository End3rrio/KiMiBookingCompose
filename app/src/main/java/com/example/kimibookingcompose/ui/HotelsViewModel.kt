package com.example.kimibookingcompose.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.kimibookingcompose.HotelApplication
import com.example.kimibookingcompose.data.Hotel
import com.example.kimibookingcompose.data.HotelsRepository
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

sealed interface HotelsUiState {
    data class Success(val hotelSearch: List<Hotel>) : HotelsUiState
    object Error : HotelsUiState
    object Loading : HotelsUiState
}

class HotelsViewModel (
    private val hotelsRepository: HotelsRepository
) : ViewModel () {

    var hotelsUiState: HotelsUiState by mutableStateOf(HotelsUiState.Loading)
        private set


    init {
        getHotels()
    }

    fun getHotels(locale: String = "en_GB", domain: String = "AE", hotel_id: Int = 1105156) {
        viewModelScope.launch {
            hotelsUiState = HotelsUiState.Loading
            hotelsUiState =
                try {
                    HotelsUiState.Success(hotelsRepository.getHotel(locale, domain, hotel_id))
                } catch (e: IOException) {
                    HotelsUiState.Error
                } catch (e: HttpException) {
                    HotelsUiState.Error
                }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as HotelApplication)
                val hotelsRepository = application.container.hotelsRepository
                HotelsViewModel(hotelsRepository = hotelsRepository)
            }
        }
    }

}