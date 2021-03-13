package com.example.androiddevchallenge.ui.screen

import androidx.compose.material.Scaffold
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.androiddevchallenge.ui.components.CommonAppBar

@Composable
fun CatDetailScreen(
    navController: NavController,
    id: Int
) {
    Scaffold(
        topBar = {
            CommonAppBar(title = "猫ちゃんプロフィール")
        },
    ) {

    }
}

@Preview("Detail Screen", widthDp = 360, heightDp = 640)
@Composable
fun CatDetailScreenPreview() {
    CatDetailScreen(navController = NavController(LocalContext.current), id = 1)
}
