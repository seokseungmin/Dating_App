package com.example.winterproject.message

import android.widget.ImageView

data class Message (
    var name: String?,
    var message: String?,
    var sendId: String?,
    var time: String?,
){
    constructor():this("","","","")
}