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
package com.vk.sdk.api.newsfeed.dto

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonNull
import com.google.gson.JsonParseException
import com.google.gson.JsonPrimitive
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type
import kotlin.String

enum class NewsfeedNewsfeedItemType(
    val value: String
) {
    POST("post"),

    PHOTO("photo"),

    PHOTO_TAG("photo_tag"),

    WALL_PHOTO("wall_photo"),

    FRIEND("friend"),

    AUDIO("audio"),

    VIDEO("video"),

    TOPIC("topic"),

    DIGEST("digest"),

    STORIES("stories"),

    CLIPS("clips"),

    PROMO_BUTTON("promo_button"),

    RECOMMENDED_GROUPS("recommended_groups"),

    TAGS_SUGGESTIONS("tags_suggestions"),

    GAMES_CAROUSEL("games_carousel"),

    FEEDBACK_POLL("feedback_poll"),

    ANIMATED_BLOCK("animated_block"),

    TEXTLIVE("textlive"),

    VIDEOS_PROMO("videos_promo"),

    RECOMMENDED_ARTISTS("recommended_artists"),

    RECOMMENDED_PLAYLISTS("recommended_playlists"),

    CLIPS_AUTOPLAY("clips_autoplay"),

    RECOMMENDED_GAME("recommended_game"),

    CLIPS_CHALLENGES("clips_challenges"),

    EXPERT_CARD("expert_card");

    class Serializer : JsonSerializer<NewsfeedNewsfeedItemType>,
            JsonDeserializer<NewsfeedNewsfeedItemType> {
        override fun serialize(
            src: NewsfeedNewsfeedItemType?,
            typeOfSrc: Type?,
            context: JsonSerializationContext?
        ): JsonElement = src?.let { JsonPrimitive(src.value) } ?: JsonNull.INSTANCE

        override fun deserialize(
            json: JsonElement?,
            typeOfT: Type?,
            context: JsonDeserializationContext?
        ): NewsfeedNewsfeedItemType {
            val value = values().firstOrNull {
                it.value.toString() == json?.asJsonPrimitive?.asString
            }
            return value ?: throw JsonParseException(json.toString())
        }
    }
}
