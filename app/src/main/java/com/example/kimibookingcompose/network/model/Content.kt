package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Content (

  @SerializedName("__typename" ) var _typename  : String? = null,
  @SerializedName("text"       ) var text       : String? = null,
  @SerializedName("markupType" ) var markupType : String? = null

)