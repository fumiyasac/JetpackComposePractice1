package com.example.androiddevchallenge.ui.screen

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun DetailScreen(
    navController: NavController,
    id: Int
) {

}

@Preview("Detail Screen", widthDp = 360, heightDp = 640)
@Composable
fun DetailScreenPreview() {
    DetailScreen(navController = NavController(LocalContext.current), id = 1)
}
