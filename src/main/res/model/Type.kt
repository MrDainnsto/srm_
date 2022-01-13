package model

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes

@SuppressLint("SupportAnnotationUsage")
data class Type(
    @DrawableRes
    val pic: Int,
    val name: String,
    val description: String
)
