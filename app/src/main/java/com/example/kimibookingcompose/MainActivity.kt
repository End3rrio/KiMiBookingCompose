package com.example.kimibookingcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kimibookingcompose.ui.HotelsApp
import com.example.kimibookingcompose.ui.screens.HotelsScreen
import com.example.kimibookingcompose.ui.theme.KiMiBookingComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KiMiBookingComposeTheme {
                HotelsScreen(onMessageSent = {})
            }
        }
    }
}