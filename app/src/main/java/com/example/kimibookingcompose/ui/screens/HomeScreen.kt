package com.example.kimibookingcompose.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kimibookingcompose.ui.HotelsUiState

@Composable
fun HomeScreen (
    hotelsUiState: HotelsUiState,
    retryAction: () -> Unit,
    modifier: Modifier
) {
    when (hotelsUiState) {
        is HotelsUiState.Loading -> LoadingScreen()
        is HotelsUiState.Success -> HotelsGridScreen(
            hotels = hotelsUiState.hotelSearch, 
            modifier = modifier 
        )
        is HotelsUiState.Error -> ErrorScreen(retryAction = retryAction, modifier)
    }
    
}

@Composable
@Preview
fun PreviewHomeScreen() {
    HomeScreen(hotelsUiState = HotelsUiState.Loading, retryAction = { /*TODO*/ }, modifier = Modifier)
}