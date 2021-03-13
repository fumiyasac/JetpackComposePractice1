package com.example.androiddevchallenge.ui.screen

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.ui.components.CommonAppBar

@Composable
fun CatListScreen() {
    Scaffold(
        topBar = {
            CommonAppBar(title = "ペット養子縁組App")
        },
    ) {

    }
}

@Preview("List Screen", widthDp = 360, heightDp = 640)
@Composable
fun CatListListScreenPreview() {
    CatListScreen()
}
