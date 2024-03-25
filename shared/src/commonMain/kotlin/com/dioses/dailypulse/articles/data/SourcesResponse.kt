package com.dioses.dailypulse.articles.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.articles.data
 * Created by Arthur Dioses Reto on 25/03/24 at 9:58 AM
 * All rights reserved 2024.
 ****/
@Serializable
data class SourceResponse(
    @SerialName("status") val status: String,
    @SerialName("sources") val sources: List<SourceRaw>,
)