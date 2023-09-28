package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Overview (

  @SerializedName("__typename"         ) var _typename          : String?         = null,
  @SerializedName("vipMessaging"       ) var vipMessaging       : String?         = null,
  @SerializedName("inventoryType"      ) var inventoryType      : String?         = null,
  @SerializedName("accessibilityLabel" ) var accessibilityLabel : String?         = null,
  @SerializedName("label"              ) var label              : String?         = null,
  @SerializedName("propertyRating"     ) var propertyRating     : PropertyRating? = PropertyRating()

)