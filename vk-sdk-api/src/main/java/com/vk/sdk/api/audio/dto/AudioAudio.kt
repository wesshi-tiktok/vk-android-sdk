/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 vk.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
*/
// *********************************************************************
// THIS FILE IS AUTO GENERATED!
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING.
// *********************************************************************
package com.vk.sdk.api.audio.dto

import com.google.gson.annotations.SerializedName
import kotlin.Int
import kotlin.String

/**
 * @param artist Artist name
 * @param id Audio ID
 * @param ownerId Audio owner's ID
 * @param title Title
 * @param duration Duration in seconds
 * @param accessKey Access key for the audio
 * @param url URL of mp3 file
 * @param date Date when uploaded
 * @param albumId Album ID
 * @param genreId Genre ID
 * @param performer Performer name
 */
data class AudioAudio(
    @SerializedName(value="artist")
    val artist: String,
    @SerializedName(value="id")
    val id: Int,
    @SerializedName(value="owner_id")
    val ownerId: Int,
    @SerializedName(value="title")
    val title: String,
    @SerializedName(value="duration")
    val duration: Int,
    @SerializedName(value="access_key")
    val accessKey: String? = null,
    @SerializedName(value="url")
    val url: String? = null,
    @SerializedName(value="date")
    val date: Int? = null,
    @SerializedName(value="album_id")
    val albumId: Int? = null,
    @SerializedName(value="genre_id")
    val genreId: Int? = null,
    @SerializedName(value="performer")
    val performer: String? = null
)
