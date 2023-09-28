package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Takeover (

  @SerializedName("__typename"      ) var _typename       : String?              = null,
  @SerializedName("amenityClosures" ) var amenityClosures : String?              = null,
  @SerializedName("highlight"       ) var highlight       : ArrayList<Highlight> = arrayListOf(),
  @SerializedName("property"        ) var property        : ArrayList<Property>  = arrayListOf()

)