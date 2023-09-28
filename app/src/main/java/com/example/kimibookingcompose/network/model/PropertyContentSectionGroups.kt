package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class PropertyContentSectionGroups (

  @SerializedName("__typename"        ) var _typename         : String?            = null,
  @SerializedName("cleanliness"       ) var cleanliness       : Cleanliness?       = Cleanliness(),
  @SerializedName("aboutThisProperty" ) var aboutThisProperty : AboutThisProperty? = AboutThisProperty(),
  @SerializedName("policies"          ) var policies          : Policies?          = Policies(),
  @SerializedName("importantInfo"     ) var importantInfo     : String?            = null

)