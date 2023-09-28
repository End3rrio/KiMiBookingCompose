package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class WhatsAround (

  @SerializedName("__typename" ) var _typename : String?    = null,
  @SerializedName("editorial"  ) var editorial : Editorial? = Editorial()

)