package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class StaticImage (

  @SerializedName("__typename"  ) var _typename   : String? = null,
  @SerializedName("description" ) var description : String? = null,
  @SerializedName("url"         ) var url         : String? = null,
  @SerializedName("aspectRatio" ) var aspectRatio : String? = null

)