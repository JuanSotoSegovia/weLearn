package com.example.welearn.model

import androidx.annotation.DrawableRes
import androidx.annotation.RawRes
import androidx.annotation.StringRes

interface InterfaceDC {
    @get:StringRes
    val name: Int

    @get:DrawableRes
    val image: Int

    @get:RawRes
    val sound: Int
}