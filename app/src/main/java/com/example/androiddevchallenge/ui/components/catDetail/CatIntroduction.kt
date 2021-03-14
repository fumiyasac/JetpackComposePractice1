package com.example.androiddevchallenge.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.TextStyle
import com.example.androiddevchallenge.entity.CatEntity
import com.example.androiddevchallenge.factory.CatFactory

@Composable
fun CatIntroduction(
    catEntity: CatEntity,
) {
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
                text = "🐱 猫ちゃん自己紹介",
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
                text = catEntity.introduction,
                style = TextStyle(
                    fontWeight = MaterialTheme.typography.body2.fontWeight,
                    fontSize = MaterialTheme.typography.body2.fontSize
                )
            )
        }
    }
}

@Preview("CatIntroduction Component")
@Composable
fun CatIntroductionPreview() {
    CatIntroduction(
        catEntity = CatFactory.getCatById(id = 14)
    )
}
