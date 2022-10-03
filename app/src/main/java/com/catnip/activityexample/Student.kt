package com.catnip.activityexample

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/

@Parcelize
data class Student(
    val name : String,
    val address : String,
    val age : Int
) : Parcelable
