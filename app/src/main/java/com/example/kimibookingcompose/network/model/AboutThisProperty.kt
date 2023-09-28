package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class AboutThisProperty (

  @SerializedName("__typename"  ) var _typename   : String?             = null,
  @SerializedName("sectionName" ) var sectionName : String?             = null,
  @SerializedName("sections"    ) var sections    : ArrayList<Sections> = arrayListOf()

)