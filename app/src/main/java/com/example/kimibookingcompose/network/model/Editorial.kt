package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Editorial (

  @SerializedName("__typename" ) var _typename : String?           = null,
  @SerializedName("title"      ) var title     : String?           = null,
  @SerializedName("content"    ) var content   : ArrayList<String> = arrayListOf()

)