package com.example.streaming

import kotlinx.serialization.Serializable

@Serializable
data class MediaOption(
    val title: String,
    val subtitle: String? = null,
    val thumbnailUrl: String? = null,
    val url: String,
)