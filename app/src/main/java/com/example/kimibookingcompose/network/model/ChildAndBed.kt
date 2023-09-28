package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class ChildAndBed (

  @SerializedName("__typename"   ) var _typename    : String?           = null,
  @SerializedName("body"         ) var body         : ArrayList<String> = arrayListOf(),
  @SerializedName("descriptions" ) var descriptions : ArrayList<String> = arrayListOf(),
  @SerializedName("title"        ) var title        : String?           = null

)