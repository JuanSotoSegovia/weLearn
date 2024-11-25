package com.example.welearn.model

import androidx.annotation.DrawableRes
import androidx.annotation.RawRes
import androidx.annotation.StringRes

data class Animal(
    @StringRes override val name: Int,
    @DrawableRes override val image: Int,
    @RawRes override val sound: Int
) : InterfaceDC
