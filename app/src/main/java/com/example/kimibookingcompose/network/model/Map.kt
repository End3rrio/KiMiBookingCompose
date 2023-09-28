package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Map (

  @SerializedName("__typename" ) var _typename : String? = null,
  @SerializedName("markers"    ) var markers   : String? = null

)