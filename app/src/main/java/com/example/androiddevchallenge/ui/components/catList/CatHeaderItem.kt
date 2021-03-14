package com.example.androiddevchallenge.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

@Composable
fun CatHeaderItem() {
    CatHeader()
    Divider(
        color = Color.LightGray,
        modifier = Modifier
            .fillMaxWidth()
            .height((0.5).dp)
    )
}

@Composable
private fun CatHeader() {
    Surface (
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(
                    all = 8.dp
                )
        ) {
            Text(
                text = "🐈 Cats List",
                style = TextStyle(
                    fontWeight = MaterialTheme.typography.h5.fontWeight,
                    fontSize = MaterialTheme.typography.h5.fontSize
                )
            )
            Spacer(
                modifier = Modifier
                    .padding(top = 8.dp)
            )
            Text(
                text = "現在募集中の猫ちゃん達の一覧です🌟",
                style = TextStyle(
                    fontWeight = MaterialTheme.typography.body2.fontWeight,
                    fontSize = MaterialTheme.typography.body2.fontSize
                )
            )
        }
    }
}

@Preview("CatHeaderItem Component")
@Composable
fun CatHeaderItemPreview() {
    CatHeaderItem()
}
