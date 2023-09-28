package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class Sections (

  @SerializedName("__typename"      ) var _typename       : String?                    = null,
  @SerializedName("sectionName"     ) var sectionName     : String?                    = null,
  @SerializedName("header"          ) var header          : Header?                    = Header(),
  @SerializedName("bodySubSections" ) var bodySubSections : ArrayList<BodySubSections> = arrayListOf(),
  @SerializedName("action"          ) var action          : String?                    = null

)