package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class PropertyReviewCountDetails (

  @SerializedName("__typename"       ) var _typename        : String? = null,
  @SerializedName("shortDescription" ) var shortDescription : String? = null

)