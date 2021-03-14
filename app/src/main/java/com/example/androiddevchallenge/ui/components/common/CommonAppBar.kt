package com.example.androiddevchallenge.ui.components

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController

@Composable
fun CommonAppBar(
    title: String,
    navController: NavController,
    shouldRoot: Boolean = false
) {
    if (shouldRoot) {
        RootAppBar(
            title = title
        )
    } else {
        DestinationAppBar(
            title = title,
            navController = navController
        )
    }
}

@Preview("Root CommonAppBar Component")
@Composable
fun RootCommonAppBarPreview() {
    CommonAppBar(
        title = "ペット養子縁組App",
        navController = NavController(LocalContext.current),
        shouldRoot = true
    )
}

@Preview("Destination CommonAppBar Component")
@Composable
fun DestinationCommonAppBarPreview() {
    CommonAppBar(
        title = "○○○ちゃんの自己紹介",
        navController = NavController(LocalContext.current),
        shouldRoot = false
    )
}
