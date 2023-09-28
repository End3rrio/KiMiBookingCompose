package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Summary (

  @SerializedName("__typename"           ) var _typename            : String?         = null,
  @SerializedName("fees"                 ) var fees                 : String?         = null,
  @SerializedName("id"                   ) var id                   : String?         = null,
  @SerializedName("name"                 ) var name                 : String?         = null,
  @SerializedName("map"                  ) var map                  : Map?            = Map(),
  @SerializedName("policies"             ) var policies             : Policies?       = Policies(),
  @SerializedName("telesalesPhoneNumber" ) var telesalesPhoneNumber : String?         = null,
  @SerializedName("bannerMessage"        ) var bannerMessage        : String?         = null,
  @SerializedName("latinAlphabetName"    ) var latinAlphabetName    : String?         = null,
  @SerializedName("tagline"              ) var tagline              : String?         = null,
  @SerializedName("starRatingIcon"       ) var starRatingIcon       : StarRatingIcon? = StarRatingIcon(),
  @SerializedName("overview"             ) var overview             : Overview?       = Overview(),
  @SerializedName("featuredMessages"     ) var featuredMessages     : String?         = null,
  @SerializedName("spaceOverview"        ) var spaceOverview        : String?         = null,
  @SerializedName("amenities"            ) var amenities            : Amenities?      = Amenities(),
  @SerializedName("cleaningAndSafety"    ) var cleaningAndSafety    : String?         = null,
  @SerializedName("location"             ) var location             : Location?       = Location(),
  @SerializedName("nearbyPOIs"           ) var nearbyPOIs           : NearbyPOIs?     = NearbyPOIs(),
  @SerializedName("lodgingChatbot"       ) var lodgingChatbot       : String?         = null

)