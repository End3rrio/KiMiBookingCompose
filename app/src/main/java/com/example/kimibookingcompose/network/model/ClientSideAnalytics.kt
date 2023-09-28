package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class ClientSideAnalytics (

  @SerializedName("__typename" ) var _typename  : String? = null,
  @SerializedName("linkName"   ) var linkName   : String? = null,
  @SerializedName("referrerId" ) var referrerId : String? = null

)