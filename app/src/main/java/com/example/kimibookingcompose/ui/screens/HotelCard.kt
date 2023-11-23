package com.example.kimibookingcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.kimibookingcompose.R
import com.example.kimibookingcompose.data.Hotel

@Composable
fun HotelsGridScreen(
    hotels: List<Hotel>,
    modifier: Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(150.dp),
        contentPadding = PaddingValues(4.dp)
    ) {
        itemsIndexed(hotels) { _, hotel ->
            HotelCard(modifier = modifier)
        }
    }
}

@Composable
fun HotelCard(
    modifier: Modifier
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.Transparent),
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .requiredHeight(296.dp)
            .paint(
                painterResource(id = R.drawable.ic_launcher_playstore),
                contentScale = ContentScale.FillBounds
            ),

        shape = RoundedCornerShape(8.dp)

    ) {
        Box(
            modifier = Modifier
                .background(color = Color.Transparent)
                .fillMaxWidth()
                .height(74.dp),
            contentAlignment = Alignment.CenterEnd,

            ) {
            Image(
                modifier = Modifier
                    .padding(16.dp)
                    .size(30.dp)
                    .background(color = Color.Transparent),
                imageVector = Icons.Default.FavoriteBorder,
                contentDescription = ""
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Transparent)
                .fillMaxWidth(0.5f)
        ) {
            Column(
                modifier = Modifier
                    .padding()
            ) {

            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ) {

            }
        }

    }
}


@Composable
@Preview
fun showHotelCard() {
    HotelCard(modifier = Modifier)
}