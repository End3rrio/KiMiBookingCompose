package com.example.kimibookingcompose.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.kimibookingcompose.R
import com.example.kimibookingcompose.ui.screens.HomeScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HotelsApp (
    modifier: Modifier = Modifier
) {
    val hotelsViewModel: HotelsViewModel =
        viewModel(factory = HotelsViewModel.Factory)

    Scaffold (
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.app_name))
                }
            )
        }
    ) {
        Surface (
            modifier = modifier
                .fillMaxSize()
                .padding(it),
            color = MaterialTheme.colorScheme.background
        ) {
            HomeScreen(
                hotelsUiState = hotelsViewModel.hotelsUiState ,
                retryAction = { hotelsViewModel.getHotels() },
                modifier = modifier
            )
        }
    }
}



@Composable
@Preview
fun hotelAppPreview () {
    HotelsApp()
}