package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Elements (

  @SerializedName("__typename" ) var _typename : String?          = null,
  @SerializedName("header"     ) var header    : Header?          = Header(),
  @SerializedName("items"      ) var items     : ArrayList<Items> = arrayListOf()

)