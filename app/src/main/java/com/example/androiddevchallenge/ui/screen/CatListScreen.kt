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

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.entity.CatEntity
import com.example.androiddevchallenge.factory.CatFactory
import com.example.androiddevchallenge.ui.components.CatHeaderItem
import com.example.androiddevchallenge.ui.components.CatListItem
import com.example.androiddevchallenge.ui.components.CommonAppBar
import com.example.androiddevchallenge.ui.navigation.Destinations

@Composable
fun CatListScreen(
    navController: NavController
) {
    Scaffold(
        topBar = {
            CommonAppBar(
                title = "ペット養子縁組App",
                navController = navController,
                shouldRoot = true
            )
        },
    ) {
        Surface(
            color = MaterialTheme.colors.background,
            modifier = Modifier.fillMaxHeight()
        ) {
            CatList(
                catLists = CatFactory.getCatList(),
                navController = navController
            )
        }
    }
}

@Composable
private fun CatList(
    catLists: List<CatEntity>,
    navController: NavController
) {
    LazyColumn(
        modifier = Modifier.fillMaxHeight()
    ) {
        items(
            count = catLists.size + 1,
            itemContent = { itemIndex ->
                if (itemIndex == 0) {
                    CatHeaderItem()
                } else {
                    val listIndex = itemIndex - 1
                    val catEntity = catLists[listIndex]
                    CatListItem(
                        catEntity = catEntity,
                        onClickItem = {
                            val detailRoute = Destinations.CatDetail.toString() + "/${catEntity.id}"
                            navController.navigate(
                                route = detailRoute
                            )
                        }
                    )
                }
            }
        )
    }
}

@Preview("List Screen", widthDp = 360, heightDp = 640)
@Composable
fun CatListListScreenPreview() {
    CatListScreen(
        navController = NavController(LocalContext.current),
    )
}
