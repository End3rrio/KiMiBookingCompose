package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class NearbyPOIs (

  @SerializedName("__typename" ) var _typename : String?          = null,
  @SerializedName("header"     ) var header    : Header?          = Header(),
  @SerializedName("icon"       ) var icon      : String?          = null,
  @SerializedName("jumpLink"   ) var jumpLink  : String?          = null,
  @SerializedName("items"      ) var items     : ArrayList<Items> = arrayListOf()

)