package com.example.kimibookingcompose.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun CustomBottomNavigation(
    navController: NavController
) {
    val listItems = listOf(
        Screen.ScreenHome,
        Screen.ScreenProfile,
        Screen.ScreenLocation,
        Screen.ScreenDate
    )

    BottomNavigation(
        backgroundColor = Color.White
    ) {
        val isFollowed = remember{
            mutableStateOf(false)
        }
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route
        listItems.forEach { item ->
            BottomNavigationItem(
                selected = currentRoute == item.route,
                onClick = {

                          navController.navigate(item.route)
                },
                icon = {
                    Icon(imageVector = item.iconId, contentDescription = "Icon")
                },
                label = {
                    Text(text = item.title, fontSize = 9.sp)
                },
                selectedContentColor = Color.Blue,
                unselectedContentColor = Color.Gray
            )
        }
    }

}