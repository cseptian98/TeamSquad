package com.example.mysubmissionapps

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Player(
    var name: String = "",
    var position: String = "",
    var photo: String = "",
    var talk: String = "",
    var country: String = "",
    var birth: String = ""
):Parcelable
