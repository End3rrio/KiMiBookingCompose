package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Toolbar (

  @SerializedName("__typename"          ) var _typename           : String? = null,
  @SerializedName("title"               ) var title               : String? = null,
  @SerializedName("icon"                ) var icon                : Icon?   = Icon(),
  @SerializedName("clientSideAnalytics" ) var clientSideAnalytics : String? = null

)