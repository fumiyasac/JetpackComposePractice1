/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.components.catList

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.entity.CatEntity
import com.example.androiddevchallenge.factory.CatFactory
import com.example.androiddevchallenge.ui.theme.lightGreen700

@Composable
fun CatDataItem(
    catEntity: CatEntity,
    onClickItem: () -> Unit
) {
    Column(
        Modifier
            .clickable(onClick = onClickItem)
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            CatImage(
                imageAsset = catEntity.imageAsset,
                contentDescription = catEntity.name
            )
            CatInformation(
                name = catEntity.name,
                birthday = catEntity.birthday,
                gender = catEntity.gender,
                number = catEntity.id.toString()
            )
        }
    }
    Divider(
        color = Color.LightGray,
        modifier = Modifier
            .fillMaxWidth()
            .height((0.5).dp)
    )
}

@Composable
private fun CatImage(
    imageAsset: Int,
    contentDescription: String
) {
    Surface(
        modifier = Modifier
            .width(96.dp)
            .clip(MaterialTheme.shapes.medium)
            .aspectRatio(3F / 2F),
    ) {
        Box {
            Image(
                painter = painterResource(imageAsset),
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .background(Color.Black.copy(alpha = 0.24f))
                    .aspectRatio(3F / 2F),
            )
        }
    }
}

@Composable
private fun CatInformation(
    name: String,
    birthday: String,
    gender: String,
    number: String
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(
                    start = 8.dp,
                    end = 8.dp
                )
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = birthday,
                    style = TextStyle(
                        fontWeight = MaterialTheme.typography.caption.fontWeight,
                        fontSize = MaterialTheme.typography.caption.fontSize
                    ),
                    modifier = Modifier
                        .padding(
                            end = 8.dp
                        ),
                    color = Color.Gray
                )
                Text(
                    text = gender,
                    style = TextStyle(
                        fontWeight = MaterialTheme.typography.caption.fontWeight,
                        fontSize = MaterialTheme.typography.caption.fontSize
                    ),
                    color = Color.Gray
                )
            }
            Spacer(
                modifier = Modifier
                    .padding(top = 4.dp)
            )
            Text(
                text = name,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(
                modifier = Modifier
                    .padding(top = 4.dp)
            )
            Text(
                text = "No.$number",
                style = TextStyle(
                    fontWeight = MaterialTheme.typography.caption.fontWeight,
                    fontSize = MaterialTheme.typography.caption.fontSize
                ),
                color = lightGreen700
            )
        }
    }
}

@Preview("CatItem Component")
@Composable
fun CatDataPreview() {
    CatDataItem(
        catEntity = CatFactory.getCatById(id = 14),
        onClickItem = {}
    )
}
