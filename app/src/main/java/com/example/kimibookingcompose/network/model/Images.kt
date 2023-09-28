package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Images (

  @SerializedName("__typename"        ) var _typename         : String? = null,
  @SerializedName("accessibilityText" ) var accessibilityText : String? = null,
  @SerializedName("actionLabel"       ) var actionLabel       : String? = null,
  @SerializedName("imageId"           ) var imageId           : String? = null,
  @SerializedName("image"             ) var image             : Image?  = Image()

)