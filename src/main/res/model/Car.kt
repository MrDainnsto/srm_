package model

import androidx.annotation.DrawableRes

data class Car(
    @DrawableRes val im_modelID: Int,
    val model: String,
    val description: String
)
