package com.example.androiddevchallenge.ui.screen

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.material.Scaffold
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.example.androiddevchallenge.factory.CatFactory
import com.example.androiddevchallenge.ui.components.CommonAppBar

@Composable
fun CatDetailScreen(
    navController: NavController,
    id: Int
) {
    val catEntity = CatFactory.getCatById(id = id)
    Scaffold(
        topBar = {
            CommonAppBar(
                title = "${catEntity.name}自己紹介",
                navController = navController,
                shouldRoot = false
            )
        },
    ) {

    }
}

@Preview("Detail Screen", widthDp = 360, heightDp = 640)
@Composable
fun CatDetailScreenPreview() {
    CatDetailScreen(navController = NavController(LocalContext.current), id = 14)
}
