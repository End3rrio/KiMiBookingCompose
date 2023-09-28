package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Trigger (

  @SerializedName("__typename"          ) var _typename           : String?              = null,
  @SerializedName("clientSideAnalytics" ) var clientSideAnalytics : ClientSideAnalytics? = ClientSideAnalytics()

)