package com.example.retrieveimagesusingcontentprovider

import android.net.Uri

data class Image(
    val id: Long,
    val name: String,
    val uri: Uri
)
