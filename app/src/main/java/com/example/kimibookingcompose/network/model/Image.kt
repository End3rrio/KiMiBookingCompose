package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Image (

  @SerializedName("__typename"  ) var _typename   : String? = null,
  @SerializedName("url"         ) var url         : String? = null,
  @SerializedName("description" ) var description : String? = null

)