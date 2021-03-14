package com.example.androiddevchallenge.ui.components

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.material.Text
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController

@Composable
fun DestinationAppBar(
    title: String,
    navController: NavController
) {
    TopAppBar(
        title = {
            Text(text = title)
        },
        navigationIcon = {
            IconButton(
                onClick = { navController.popBackStack() }
            ) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = title
                )
            }
        },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = Color.White
    )
}

@Preview("DestinationAppBar Component")
@Composable
fun DestinationAppBarPreview() {
    DestinationAppBar(
        title = "○○○ちゃんの自己紹介",
        navController = NavController(LocalContext.current)
    )
}
