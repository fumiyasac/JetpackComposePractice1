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
