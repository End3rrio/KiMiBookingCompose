package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class ReviewInfo (

  @SerializedName("__typename" ) var _typename : String?  = null,
  @SerializedName("summary"    ) var summary   : Summary? = Summary()

)