package com.example.androiddevchallenge.ui.components

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.material.Text
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.graphics.Color

@Composable
fun RootAppBar(
    title: String,
) {
    TopAppBar(
        title = {
            Text(text = title)
        },
        navigationIcon = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = title
                )
            }
        },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = Color.White
    )
}

@Preview("RootAppBar Component")
@Composable
fun RootAppBarPreview() {
    RootAppBar(
        title = "ペット養子縁組App"
    )
}
