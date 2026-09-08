package com.olivenbaum.memesbrasil.data

import androidx.annotation.DrawableRes
import androidx.annotation.RawRes

data class SoundItem(
    val name: String,
    @RawRes val soundResId: Int
)

data class Category(
    val name: String,
    @DrawableRes val imageResId: Int,
    val sounds: List<SoundItem>
)
