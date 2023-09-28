package com.example.kimibookingcompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.kimibookingcompose.R

@Composable
fun ErrorScreen (retryAction: () -> Unit, modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(id = R.string.loading_failed))
        Button(onClick = retryAction) {
            Text(text = stringResource(id = R.string.retry))
        }
    }
}

@Composable
@Preview
fun PreviewErrorScreen() {
    ErrorScreen(retryAction = { /*TODO*/ })
}