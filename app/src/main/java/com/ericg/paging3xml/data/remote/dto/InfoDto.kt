package com.ericg.paging3xml.data.remote.dto

import com.google.gson.annotations.SerializedName

data class InfoDto(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("prev")
    val prev: Any
)