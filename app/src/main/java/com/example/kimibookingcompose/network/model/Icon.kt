package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Icon (

  @SerializedName("__typename"  ) var _typename   : String? = null,
  @SerializedName("id"          ) var id          : String? = null,
  @SerializedName("description" ) var description : String? = null,
  @SerializedName("size"        ) var size        : String? = null,
  @SerializedName("token"       ) var token       : String? = null,
  @SerializedName("theme"       ) var theme       : String? = null

)