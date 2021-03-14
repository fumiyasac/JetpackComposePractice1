package com.example.androiddevchallenge.factory

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
            imageAsset = R.drawable.cat_image_15,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
        CatEntity(
            id = 16,
            name = "モカちゃん",
            birthday = "2020/12/08",
            gender = "女の子",
            imageAsset = R.drawable.cat_image_16,
            introduction = createIntroduction(),
            testimonial = createTestimonial()
        ),
    )

    private fun createIntroduction(): String =
        "※猫ちゃんの自己紹介サンプル\nこんにちニャ！私は○○って言うんだ。高い所に登ったり段ボール箱の中に入ったりすることが好きなんだニャ。特に最近は暖かくなってきたので結構寝ている時間が長くなってしまうことが多いけど、遊ぶことと触れ合うことは大好きなので是非ともよろしくニャ！"

    private fun createTestimonial(): String =
        "※猫ちゃんの推薦文紹介サンプル\n元気でかわいい猫ちゃんになります。本当にどの子も個性的かつ甘えん坊なのでよろしくお願いします！"
}
