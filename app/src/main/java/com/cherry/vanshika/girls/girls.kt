package com.cherry.vanshika.girls

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class girls(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val girls1 = listOf(
    girls(R.drawable.kritisanon, R.string.girls_name_1, 32, R.string.girls_description),
    girls(R.drawable.kiaraadvani, R.string.girls_name_2, 30, R.string.girls_description),
    girls(R.drawable.katrinakaif, R.string.girls_name_3, 39, R.string.girls_description),
    girls(R.drawable.aliabhatt, R.string.girls_name_4, 29, R.string.girls_description),
    girls(R.drawable.shraddhakapoor, R.string.girls_name_5, 35, R.string.girls_description),
    girls(R.drawable.anushkasharma,R.string.girls_name_6,34,R.string.girls_description),
    girls(R.drawable.ananyapandey,R.string.girls_name_7,24,R.string.girls_description),
    girls(R.drawable.deepikapadukone,R.string.girls_name_8,36,R.string.girls_description),
    girls(R.drawable.saraalikhan,R.string.girls_name_9,27,R.string.girls_description),
    girls(R.drawable.tarasutaria,R.string.girls_name_10,26,R.string.girls_description),
)