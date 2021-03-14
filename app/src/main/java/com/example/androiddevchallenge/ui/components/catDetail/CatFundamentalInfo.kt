package com.example.androiddevchallenge.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.example.androiddevchallenge.factory.CatFactory
import com.example.androiddevchallenge.entity.CatEntity
import com.example.androiddevchallenge.ui.theme.lightGreen700

@Composable
fun CatFundamentalInfo(
    catEntity: CatEntity
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
                text = "🗒 基本情報",
                style = TextStyle(
                    fontWeight = MaterialTheme.typography.h5.fontWeight,
                    fontSize = MaterialTheme.typography.h5.fontSize
                )
            )
            Spacer(
                modifier = Modifier
                    .padding(top = 8.dp)
            )
            CatNumber(number = catEntity.id)
            Spacer(
                modifier = Modifier
                    .padding(top = 12.dp)
            )
            CatBirthday(birthday = catEntity.birthday)
            Spacer(
                modifier = Modifier
                    .padding(top = 12.dp)
            )
            CatGender(gender = catEntity.gender)
        }
    }
}

@Composable
private fun CatNumber(
    number: Int
) {
    Text(
        text = "No.${number}",
        style = TextStyle(
            fontWeight = MaterialTheme.typography.body2.fontWeight,
            fontSize = MaterialTheme.typography.body2.fontSize
        ),
        color = lightGreen700
    )
}

@Composable
private fun CatBirthday(
    birthday: String
) {
    Text(
        text = "お誕生日: $birthday",
        style = TextStyle(
            fontWeight = MaterialTheme.typography.body2.fontWeight,
            fontSize = MaterialTheme.typography.body2.fontSize
        ),
        color = Color.Gray
    )
}

@Composable
private fun CatGender(
    gender: String
) {
    Text(
        text = "性別: $gender",
        style = TextStyle(
            fontWeight = MaterialTheme.typography.body2.fontWeight,
            fontSize = MaterialTheme.typography.body2.fontSize
        ),
        color = Color.Gray
    )
}

@Preview("CatFundamentalInfo Component")
@Composable
fun CatFundamentalInfoPreview() {
    CatFundamentalInfo(
        catEntity = CatFactory.getCatById(id = 14)
    )
}
