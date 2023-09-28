package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class MapDialog (

  @SerializedName("__typename" ) var _typename : String?  = null,
  @SerializedName("trigger"    ) var trigger   : Trigger? = Trigger(),
  @SerializedName("toolbar"    ) var toolbar   : String?  = null

)