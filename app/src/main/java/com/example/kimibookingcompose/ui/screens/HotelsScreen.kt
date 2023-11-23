package com.example.kimibookingcompose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.kimibookingcompose.navigation.AppNavGraph
import com.example.kimibookingcompose.navigation.CustomBottomNavigation

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun HotelsScreen(
    modifier: Modifier = Modifier,
    onMessageSent: (String) -> Unit
) {
    val navHostController = rememberNavController()
    var message by remember { mutableStateOf("") }
    val keyboardController = LocalSoftwareKeyboardController.current

    Scaffold(
        bottomBar = {
            CustomBottomNavigation(navController = navHostController)
        },
        topBar = {
            androidx.compose.material.TopAppBar(
                {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        TextField(
                            value = message,
                            onValueChange = {
                                message = it
                            },
                            keyboardActions = KeyboardActions(
                                onSend = {
                                    if (message.isNotEmpty()) {
                                        onMessageSent(message)
                                        message = ""
                                        keyboardController?.hide()
                                    }
                                }
                            ),
                            shape = CircleShape,
                            modifier = Modifier
                                .weight(0.7F)
                                .fillMaxWidth()
                                .height(36.dp)
                                .padding(8.dp)


                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        Button(
                            onClick = {
                                if (message.isNotEmpty()) {
                                    onMessageSent(message)
                                    message = ""
                                }
                            },
                            modifier = Modifier
                                .height(36.dp)
                                .weight(0.3F)
                                .fillMaxWidth()

                        ) {
                            androidx.compose.material.Text(
                                text = "Поиск",
                                fontSize = 10.sp,
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        }
                    }
                },
                backgroundColor = Color.Blue,
                navigationIcon = {
                    IconButton(
                        onClick = { }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "Menu"
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = { }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "Delete"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        AppNavGraph(
            navHostController = navHostController,
            homeScreenContent = {  },
            dateScreenContent = { /*TODO*/ },
            locationScreenContent = { /*TODO*/ }) {
            
        }

        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(paddingValues)
        ) {
            items(10) {position ->
                Row {
                    HotelCard(
                        modifier = Modifier
                    )
                }
            }
        }

    }
}




