package com.example.kimibookingcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavGraph(
    navHostController: NavHostController,
    homeScreenContent: @Composable () -> Unit,
    dateScreenContent: @Composable () -> Unit,
    locationScreenContent: @Composable () -> Unit,
    profileScreenContent: @Composable () -> Unit,
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.ScreenHome.route
    ) {
        composable(Screen.ScreenHome.route) {
            homeScreenContent
        }
        composable(Screen.ScreenDate.route) {
            dateScreenContent
        }
        composable(Screen.ScreenLocation.route) {
            locationScreenContent
        }
        composable(Screen.ScreenProfile.route) {
            profileScreenContent
        }
    }
}