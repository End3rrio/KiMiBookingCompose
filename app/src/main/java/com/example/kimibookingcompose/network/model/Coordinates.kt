package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Coordinates (

  @SerializedName("__typename" ) var _typename : String? = null,
  @SerializedName("latitude"   ) var latitude  : Double? = null,
  @SerializedName("longitude"  ) var longitude : Double? = null

)