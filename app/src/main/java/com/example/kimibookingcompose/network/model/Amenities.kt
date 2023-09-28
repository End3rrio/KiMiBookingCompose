package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Amenities (

  @SerializedName("__typename"                 ) var _typename                  : String?              = null,
  @SerializedName("amenities"                  ) var amenities                  : ArrayList<Amenities> = arrayListOf(),
  @SerializedName("topAmenities"               ) var topAmenities               : TopAmenities?        = TopAmenities(),
  @SerializedName("propertyContentPreferences" ) var propertyContentPreferences : String?              = null,
  @SerializedName("amenitiesDialog"            ) var amenitiesDialog            : AmenitiesDialog?     = AmenitiesDialog(),
  @SerializedName("takeover"                   ) var takeover                   : Takeover?            = Takeover()

)