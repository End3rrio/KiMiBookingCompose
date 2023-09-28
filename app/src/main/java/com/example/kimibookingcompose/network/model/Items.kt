package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Items (

  @SerializedName("__typename" ) var _typename : String?  = null,
  @SerializedName("content"    ) var content   : Content? = Content()

)