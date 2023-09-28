package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Header (

  @SerializedName("__typename"  ) var _typename   : String? = null,
  @SerializedName("text"        ) var text        : String? = null,
  @SerializedName("subText"     ) var subText     : String? = null,
  @SerializedName("icon"        ) var icon        : String? = null,
  @SerializedName("headerImage" ) var headerImage : String? = null

)