package com.dioses.dailypulse.articles.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.internal.FormatLanguage

@Serializable
data class SourceRaw(
    @SerialName("id") val id: String,
    @SerialName("name") val name: String,
    @SerialName("description") val desc: String,
    @SerialName("language") val language: String,
    @SerialName("country") val country: String,
)
