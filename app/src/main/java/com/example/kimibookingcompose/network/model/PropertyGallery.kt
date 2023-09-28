package com.example.kimibookingcompose

import com.google.gson.annotations.SerializedName


data class PropertyGallery (

  @SerializedName("__typename"             ) var _typename              : String?                 = null,
  @SerializedName("imagesGrouped"          ) var imagesGrouped          : String?                 = null,
  @SerializedName("images"                 ) var images                 : ArrayList<Images>       = arrayListOf(),
  @SerializedName("accessibilityLabel"     ) var accessibilityLabel     : String?                 = null,
  @SerializedName("thumbnailGalleryDialog" ) var thumbnailGalleryDialog : ThumbnailGalleryDialog? = ThumbnailGalleryDialog(),
  @SerializedName("mediaGalleryDialog"     ) var mediaGalleryDialog     : MediaGalleryDialog?     = MediaGalleryDialog()

)