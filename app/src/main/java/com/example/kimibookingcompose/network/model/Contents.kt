package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Contents (

  @SerializedName("__typename" ) var _typename : String?  = null,
  @SerializedName("primary"    ) var primary   : Primary? = Primary(),
  @SerializedName("secondary"  ) var secondary : String?  = null

)