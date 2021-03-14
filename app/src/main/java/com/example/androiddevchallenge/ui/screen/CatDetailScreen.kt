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
package com.example.androiddevchallenge.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.androiddevchallenge.factory.CatFactory
import com.example.androiddevchallenge.ui.components.CatDetailTitle
import com.example.androiddevchallenge.ui.components.CatFundamentalInfo
import com.example.androiddevchallenge.ui.components.CatImageAndName
import com.example.androiddevchallenge.ui.components.CatIntroduction
import com.example.androiddevchallenge.ui.components.CatTestimonial
import com.example.androiddevchallenge.ui.components.CommonAppBar

@Composable
fun CatDetailScreen(
    navController: NavController,
    id: Int
) {
    val catEntity = CatFactory.getCatById(id = id)
    Scaffold(
        topBar = {
            CommonAppBar(
                title = "${catEntity.name}自己紹介",
                navController = navController,
                shouldRoot = false
            )
        },
    ) {
        Surface(
            color = MaterialTheme.colors.background,
            modifier = Modifier.fillMaxHeight()
        ) {
            Column(
                Modifier
                    .verticalScroll(rememberScrollState())
            ) {
                CatImageAndName(
                    catEntity = catEntity,
                    onClickContact = {}
                )
                CatDetailTitle()
                CatFundamentalInfo(
                    catEntity = catEntity
                )
                CatIntroduction(
                    catEntity = catEntity
                )
                CatTestimonial(
                    catEntity = catEntity
                )
            }
        }
    }
}

@Preview("Detail Screen", widthDp = 360, heightDp = 640)
@Composable
fun CatDetailScreenPreview() {
    CatDetailScreen(navController = NavController(LocalContext.current), id = 14)
}
