package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class PropertyRating (

  @SerializedName("__typename"    ) var _typename     : String? = null,
  @SerializedName("rating"        ) var rating        : Int?    = null,
  @SerializedName("accessibility" ) var accessibility : String? = null,
  @SerializedName("icon"          ) var icon          : Icon?   = Icon()

)