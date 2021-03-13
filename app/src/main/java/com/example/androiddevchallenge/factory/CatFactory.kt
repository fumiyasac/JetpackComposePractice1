package com.example.androiddevchallenge.factory

import android.content.res.Resources
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.entity.CatEntity

object CatFactory {

    fun getCatList(): List<CatEntity> = create()

    fun getCatById(id: Int): CatEntity = create().first { id == it.id }

    private fun create(): List<CatEntity> = listOf(
        CatEntity(
            id = 1,
            name = "レオくん",
            birthday = "2020/12/08",
            gender = "男の子",
            imageAsset = R.drawable.cat_image_1,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 2,
            name = "ムギちゃん",
            birthday = "2020/12/08",
            gender = "女の子",
            imageAsset = R.drawable.cat_image_2,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 3,
            name = "ソラくん",
            birthday = "2020/12/08",
            gender = "男の子",
            imageAsset = R.drawable.cat_image_3,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 4,
            name = "モモちゃん",
            birthday = "2020/12/08",
            gender = "女の子",
            imageAsset = R.drawable.cat_image_4,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 5,
            name = "ムギくん",
            birthday = "2020/12/08",
            gender = "男の子",
            imageAsset = R.drawable.cat_image_5,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 6,
            name = "ココちゃん",
            birthday = "2020/12/08",
            gender = "女の子",
            imageAsset = R.drawable.cat_image_6,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 7,
            name = "マルくん",
            birthday = "2020/12/08",
            gender = "男の子",
            imageAsset = R.drawable.cat_image_7,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 8,
            name = "ルナちゃん",
            birthday = "2020/12/08",
            gender = "女の子",
            imageAsset = R.drawable.cat_image_8,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 9,
            name = "フクくん",
            birthday = "2020/12/08",
            gender = "男の子",
            imageAsset = R.drawable.cat_image_9,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 10,
            name = "リンちゃん",
            birthday = "2020/12/08",
            gender = "女の子",
            imageAsset = R.drawable.cat_image_10,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 11,
            name = "コテツくん",
            birthday = "2020/12/08",
            gender = "男の子",
            imageAsset = R.drawable.cat_image_11,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 12,
            name = "ハナちゃん",
            birthday = "2020/12/08",
            gender = "女の子",
            imageAsset = R.drawable.cat_image_12,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 13,
            name = "チャチャマルくん",
            birthday = "2020/12/08",
            gender = "男の子",
            imageAsset = R.drawable.cat_image_13,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 14,
            name = "キナコちゃん",
            birthday = "2020/12/08",
            gender = "女の子",
            imageAsset = R.drawable.cat_image_14,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 15,
            name = "レオンくん",
            birthday = "2020/12/08",
            gender = "男の子",
            imageAsset = R.drawable.cat_image_13,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 16,
            name = "モカちゃん",
            birthday = "2020/12/08",
            gender = "女の子",
            imageAsset = R.drawable.cat_image_14,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
    )

    private fun createIntroduction(): String =
        Resources.getSystem().getString(R.string.statement_introduction)

    private fun createTestimonial(): String =
        Resources.getSystem().getString(R.string.statement_testimonial)
}
