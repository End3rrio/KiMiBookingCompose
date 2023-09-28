package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Address (

  @SerializedName("__typename"        ) var _typename         : String? = null,
  @SerializedName("addressLine"       ) var addressLine       : String? = null,
  @SerializedName("city"              ) var city              : String? = null,
  @SerializedName("province"          ) var province          : String? = null,
  @SerializedName("countryCode"       ) var countryCode       : String? = null,
  @SerializedName("firstAddressLine"  ) var firstAddressLine  : String? = null,
  @SerializedName("secondAddressLine" ) var secondAddressLine : String? = null

)