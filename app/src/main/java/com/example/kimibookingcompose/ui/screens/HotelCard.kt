package com.example.kimibookingcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
    //hotel: Hotel,
    modifier: Modifier
) {
    Card(
        modifier = modifier
            .padding(4.dp)
            .fillMaxWidth()
            .requiredHeight(296.dp),

        ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
//            hotel.name?.let {
//                Text(
//                    text = it,
//                    textAlign = TextAlign.Center,
//                    modifier = modifier
//                        .padding(top = 4.dp, bottom = 8.dp)
//                    )
//            }
            Image(
                painter = painterResource(id = R.drawable.ic_hotel_card1),
                contentDescription = stringResource(id = R.string.content_description)
            )
        }
    }
}

@Composable
@Preview
fun showHotelCard() {
    var hotel = Hotel("test", "blablabla", "dom2")
    HotelCard(modifier = Modifier)
}