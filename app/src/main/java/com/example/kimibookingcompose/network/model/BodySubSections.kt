package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class BodySubSections (

  @SerializedName("__typename" ) var _typename  : String?             = null,
  @SerializedName("elements"   ) var elements   : ArrayList<Elements> = arrayListOf(),
  @SerializedName("expando"    ) var expando    : String?             = null,
  @SerializedName("maxColumns" ) var maxColumns : Int?                = null

)