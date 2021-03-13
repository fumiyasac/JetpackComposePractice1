package com.example.androiddevchallenge.factory

import com.example.androiddevchallenge.entity.CatEntity

object CatFactory {

    fun catList(): List<CatEntity> = create()

    private fun create(): List<CatEntity> = listOf()
}
