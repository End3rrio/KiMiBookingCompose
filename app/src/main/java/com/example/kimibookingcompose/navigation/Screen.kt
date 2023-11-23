package com.example.kimibookingcompose.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val title: String, val iconId: ImageVector, val route: String){
        object ScreenHome: Screen("Home", Icons.Default.Home, "ROUTE_HOME_SCREEN" )
        object ScreenDate: Screen("Date", Icons.Default.DateRange, "ROUTE_DATE_SCREEN" )
        object ScreenLocation: Screen("Location", Icons.Default.LocationOn, "ROUTE_LOCATION_SCREEN" )
        object ScreenProfile: Screen("Profile", Icons.Default.AccountCircle, "ROUTE_PROFILE_SCREEN" )

        private companion object {
            const val ROUTE_HOME_SCREEN = "home_screen"
            const val ROUTE_DATE_SCREEN = "home_screen"
            const val ROUTE_LOCATION_SCREEN = "home_screen"
            const val ROUTE_PROFILE_SCREEN = "home_screen"
        }
}