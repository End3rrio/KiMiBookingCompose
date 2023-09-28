package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Location (

  @SerializedName("__typename"      ) var _typename       : String?          = null,
  @SerializedName("address"         ) var address         : Address?         = Address(),
  @SerializedName("coordinates"     ) var coordinates     : Coordinates?     = Coordinates(),
  @SerializedName("multiCityRegion" ) var multiCityRegion : MultiCityRegion? = MultiCityRegion(),
  @SerializedName("whatsAround"     ) var whatsAround     : WhatsAround?     = WhatsAround(),
  @SerializedName("mapDialog"       ) var mapDialog       : MapDialog?       = MapDialog(),
  @SerializedName("staticImage"     ) var staticImage     : StaticImage?     = StaticImage()

)