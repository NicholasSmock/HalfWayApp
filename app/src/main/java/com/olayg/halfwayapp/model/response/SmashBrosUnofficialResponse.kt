package com.olayg.halfwayapp.model.response

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize


@JsonClass(generateAdapter = true)
@Parcelize
data class CharacterImageResponse(
    val name: String,
    @Json(name = "images")
    val image: Image,
    val series: Series
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Image(
    val icon: String,
    val portrait: String
) : Parcelable
@JsonClass(generateAdapter = true)
@Parcelize
data class Series(
    val icon: String,
    val name: String
) : Parcelable
