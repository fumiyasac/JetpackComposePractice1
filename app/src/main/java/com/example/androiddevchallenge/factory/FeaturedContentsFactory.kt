package com.example.androiddevchallenge.factory

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.entity.FeaturedContentsEntity

object FeaturedContentsFactory {

    fun getFeaturedContents(): List<FeaturedContentsEntity> = create()

    private fun create(): List<FeaturedContentsEntity> = listOf(
        FeaturedContentsEntity(
            id = 1,
            title = "猫ちゃんお気に入りおもちゃNo.1",
            catch = "思わず虜にしてしまうおもちゃ紹介！",
            imageAsset = R.drawable.cat_teaser_1
        ),
        FeaturedContentsEntity(
            id = 2,
            title = "猫ちゃんお気に入りおもちゃNo.2",
            catch = "思わず虜にしてしまうおもちゃ紹介！",
            imageAsset = R.drawable.cat_teaser_2
        ),
        FeaturedContentsEntity(
            id = 3,
            title = "猫ちゃんお気に入りおもちゃNo.3",
            catch = "思わず虜にしてしまうおもちゃ紹介！",
            imageAsset = R.drawable.cat_teaser_3
        ),
    )
}
