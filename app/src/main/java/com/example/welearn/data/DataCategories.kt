package com.example.welearn.data

import com.example.welearn.R
import com.example.welearn.model.Categorie

object DataCategories {
    val categorieList = listOf(
        Categorie(R.string.categorie_1, R.drawable.categorie_animals, R.raw.audio_categorie_animals),
        Categorie(R.string.categorie_2, R.drawable.categorie_colors, R.raw.audio_categorie_colors),
        Categorie(R.string.categorie_3, R.drawable.categorie_relatives, R.raw.audio_categorie_relatives)
    )
}