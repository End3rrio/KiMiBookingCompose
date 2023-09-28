package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class MultiCityRegion (

  @SerializedName("__typename" ) var _typename : String? = null,
  @SerializedName("id"         ) var id        : String? = null

)