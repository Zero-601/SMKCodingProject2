package com.kamikaze.smkcodingproject2.dataclass


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("FID")
    val fID: Int,
    @SerializedName("Provinsi")
    val provinsi: String,
    @SerializedName("Kasus_Meni")
    val kasusMeni: Int,
    @SerializedName("Kasus_Posi")
    val kasusPosi: Int,
    @SerializedName("Kasus_Semb")
    val kasusSemb: Int,
    @SerializedName("Kode_Provi")
    val kodeProvi: Int
)