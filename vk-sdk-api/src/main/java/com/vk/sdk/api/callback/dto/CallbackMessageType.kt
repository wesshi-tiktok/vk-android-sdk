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
package com.vk.sdk.api.callback.dto

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

enum class CallbackMessageType(
    val value: String
) {
    AUDIO_NEW("audio_new"),

    BOARD_POST_NEW("board_post_new"),

    BOARD_POST_EDIT("board_post_edit"),

    BOARD_POST_RESTORE("board_post_restore"),

    BOARD_POST_DELETE("board_post_delete"),

    CONFIRMATION("confirmation"),

    GROUP_LEAVE("group_leave"),

    GROUP_JOIN("group_join"),

    GROUP_CHANGE_PHOTO("group_change_photo"),

    GROUP_CHANGE_SETTINGS("group_change_settings"),

    GROUP_OFFICERS_EDIT("group_officers_edit"),

    LEAD_FORMS_NEW("lead_forms_new"),

    MARKET_COMMENT_NEW("market_comment_new"),

    MARKET_COMMENT_DELETE("market_comment_delete"),

    MARKET_COMMENT_EDIT("market_comment_edit"),

    MARKET_COMMENT_RESTORE("market_comment_restore"),

    MESSAGE_ALLOW("message_allow"),

    MESSAGE_NEW("message_new"),

    MESSAGE_DENY("message_deny"),

    MESSAGE_READ("message_read"),

    MESSAGE_REPLY("message_reply"),

    MESSAGE_EDIT("message_edit"),

    MESSAGE_TYPING_STATE("message_typing_state"),

    MESSAGES_EDIT("messages_edit"),

    PHOTO_NEW("photo_new"),

    PHOTO_COMMENT_NEW("photo_comment_new"),

    PHOTO_COMMENT_DELETE("photo_comment_delete"),

    PHOTO_COMMENT_EDIT("photo_comment_edit"),

    PHOTO_COMMENT_RESTORE("photo_comment_restore"),

    POLL_VOTE_NEW("poll_vote_new"),

    USER_BLOCK("user_block"),

    USER_UNBLOCK("user_unblock"),

    VIDEO_NEW("video_new"),

    VIDEO_COMMENT_NEW("video_comment_new"),

    VIDEO_COMMENT_DELETE("video_comment_delete"),

    VIDEO_COMMENT_EDIT("video_comment_edit"),

    VIDEO_COMMENT_RESTORE("video_comment_restore"),

    WALL_POST_NEW("wall_post_new"),

    WALL_REPLY_NEW("wall_reply_new"),

    WALL_REPLY_EDIT("wall_reply_edit"),

    WALL_REPLY_DELETE("wall_reply_delete"),

    WALL_REPLY_RESTORE("wall_reply_restore"),

    WALL_REPOST("wall_repost"),

    APP_PAYLOAD("app_payload"),

    LIKE_ADD("like_add"),

    LIKE_REMOVE("like_remove"),

    VKPAY_TRANSACTION("vkpay_transaction"),

    MESSAGE_EVENT("message_event");

    class Serializer : JsonSerializer<CallbackMessageType>, JsonDeserializer<CallbackMessageType> {
        override fun serialize(
            src: CallbackMessageType?,
            typeOfSrc: Type?,
            context: JsonSerializationContext?
        ): JsonElement = src?.let { JsonPrimitive(src.value) } ?: JsonNull.INSTANCE

        override fun deserialize(
            json: JsonElement?,
            typeOfT: Type?,
            context: JsonDeserializationContext?
        ): CallbackMessageType {
            val value = values().firstOrNull {
                it.value.toString() == json?.asJsonPrimitive?.asString
            }
            return value ?: throw JsonParseException(json.toString())
        }
    }
}
