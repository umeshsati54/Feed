package com.usati.feed

data class Feed(
    var profileResId: Int,
    var name: String,
    var seen: Int,
    var caption: String,
    var postImgResId: Int
)
