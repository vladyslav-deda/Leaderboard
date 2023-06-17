package com.lederboard.app.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val name: String,
    val username: String,
    val image: Int,
    val score: Int,
    val isScoreGrowing: Boolean
) : Parcelable