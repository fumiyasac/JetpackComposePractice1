package com.example.androiddevchallenge.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.androiddevchallenge.entity.CatEntity
import com.example.androiddevchallenge.factory.CatFactory
import com.example.androiddevchallenge.ui.components.CatHeaderItem
import com.example.androiddevchallenge.ui.components.CatListItem
import com.example.androiddevchallenge.ui.components.CommonAppBar

@Composable
fun CatListScreen() {
    Scaffold(
        topBar = {
            CommonAppBar(title = "ペット養子縁組App")
        },
    ) {
        Surface(
            color = MaterialTheme.colors.background,
            modifier = Modifier.fillMaxHeight()
        ) {
            CatList(
                catLists = CatFactory.getCatList(),
            )
        }
    }
}

@Composable
private fun CatList(
    catLists: List<CatEntity>
) {
    LazyColumn(
        modifier = Modifier.fillMaxHeight()
    ) {
        items(count = catLists.size + 1, itemContent = { index ->
            if (index == 0) {
                CatHeaderItem(
                    title = "Cats List"
                )
            } else {
                CatListItem(
                    catEntity = catLists[index - 1],
                    onClickItem = {}
                )
            }
        })
    }
}

@Preview("List Screen", widthDp = 360, heightDp = 640)
@Composable
fun CatListListScreenPreview() {
    CatListScreen()
}
