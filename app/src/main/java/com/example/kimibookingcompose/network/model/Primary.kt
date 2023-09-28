package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Primary (

  @SerializedName("__typename"         ) var _typename          : String? = null,
  @SerializedName("value"              ) var value              : String? = null,
  @SerializedName("accessibilityLabel" ) var accessibilityLabel : String? = null,
  @SerializedName("icon"               ) var icon               : String? = null

)