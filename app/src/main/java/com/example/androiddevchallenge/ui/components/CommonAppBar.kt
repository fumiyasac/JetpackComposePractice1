package com.example.androiddevchallenge.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.graphics.Color

@Composable
fun CommonAppBar(
    title: String
) {
    TopAppBar(
        title = { Text(text = title) },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = Color.White
    )
}

@Preview("CustomAppBar Component")
@Composable
fun CustomAppBarPreview() {
    CommonAppBar(title = "ペット養子縁組App")
}
