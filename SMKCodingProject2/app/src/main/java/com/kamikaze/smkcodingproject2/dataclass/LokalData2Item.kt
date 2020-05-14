package com.kamikaze.smkcodingproject2.dataclass


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class LokalData2Item(
    @SerializedName("Provinsi")
    val provinsi: String,
    @SerializedName("Kode_Provi")
    val kodeProvi: Int,
    @SerializedName("FID")
    val fID: Int,
    @SerializedName("Kasus_Meni")
    val kasusMeni: Int,
    @SerializedName("Kasus_Posi")
    val kasusPosi: Int,
    @SerializedName("Kasus_Semb")
    val kasusSemb: Int
) : Serializable