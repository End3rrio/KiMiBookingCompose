package com.example.kimibookingcompose.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomItem(val title: String, val iconId: ImageVector, val route: String){
    object Screen1: BottomItem("Home", Icons.Default.Home, "screen_1" )
    object Screen2: BottomItem("Date", Icons.Default.DateRange, "screen_2" )
    object Screen3: BottomItem("Location", Icons.Default.LocationOn, "screen_3" )
    object Screen4: BottomItem("Profile", Icons.Default.AccountCircle, "screen_4" )

}
