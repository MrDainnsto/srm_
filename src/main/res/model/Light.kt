package model

import androidx.annotation.DrawableRes

data class Light(
    @DrawableRes val im_modelID: Int,
    val name: String,
    val car_name: String,
    val type: String,
    val price: Int
)
