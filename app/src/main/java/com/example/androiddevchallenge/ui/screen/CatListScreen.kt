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
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.entity.CatEntity
import com.example.androiddevchallenge.ui.components.catList.CatDataItem
import com.example.androiddevchallenge.ui.components.catList.CatHeaderItem
import com.example.androiddevchallenge.ui.components.common.CommonAppBar
import com.example.androiddevchallenge.viewmodel.CatListViewModel

@Composable
fun CatListScreen(
    catListViewModel: CatListViewModel,
    openCatDetail: (Int) -> Unit
) {
    val catsList = catListViewModel.catsList.observeAsState(initial = listOf())
    Scaffold(
        topBar = {
            CommonAppBar(
                title = "ペット養子縁組App",
                navigateBack = {},
                shouldRoot = true
            )
        },
    ) {
        Surface(
            color = MaterialTheme.colors.background,
            modifier = Modifier.fillMaxHeight()
        ) {
            CatList(
                catLists = catsList.value,
                openCatDetail = openCatDetail
            )
        }
    }
}

@Composable
private fun CatList(
    catLists: List<CatEntity>,
    openCatDetail: (Int) -> Unit
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
                    CatDataItem(
                        catEntity = catEntity,
                        onClickItem = {
                            openCatDetail(catEntity.id)
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
        catListViewModel = CatListViewModel(),
        openCatDetail = {}
    )
}
