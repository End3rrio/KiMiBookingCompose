package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Hotel (

  @SerializedName("__typename"                   ) var _typename                    : String?                       = null,
  @SerializedName("summary"                      ) var summary                      : Summary?                      = Summary(),
  @SerializedName("propertyGallery"              ) var propertyGallery              : PropertyGallery?              = PropertyGallery(),
  @SerializedName("reviewInfo"                   ) var reviewInfo                   : ReviewInfo?                   = ReviewInfo(),
  @SerializedName("propertyContentSectionGroups" ) var propertyContentSectionGroups : PropertyContentSectionGroups? = PropertyContentSectionGroups(),
  @SerializedName("saveTripItem"                 ) var saveTripItem                 : String?                       = null

)