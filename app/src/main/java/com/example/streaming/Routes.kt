package com.example.streaming

import com.example.streaming.data.SourceType
import kotlinx.serialization.Serializable

@Serializable
object SourceSelection

@Serializable
data class MediaSelection(val sourceType: SourceType)

@Serializable
data class Player(val title: String, val url: String)