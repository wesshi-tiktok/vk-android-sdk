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
package com.vk.sdk.api.account.dto

import com.google.gson.annotations.SerializedName
import com.vk.sdk.api.base.dto.BaseBoolInt
import kotlin.Int

/**
 * @param disabledUntil Time until that notifications are disabled in seconds
 * @param peerId Peer ID
 * @param sound Information whether the sound are enabled
 * @param disabledMentions Information whether the mentions are disabled
 * @param disabledMassMentions Information whether the mass mentions (like '@all', '@online') are
 * disabled. Can be affected by 'disabled_mentions'
 */
data class AccountPushConversationsItem(
    @SerializedName(value="disabled_until")
    val disabledUntil: Int,
    @SerializedName(value="peer_id")
    val peerId: Int,
    @SerializedName(value="sound")
    val sound: BaseBoolInt,
    @SerializedName(value="disabled_mentions")
    val disabledMentions: BaseBoolInt? = null,
    @SerializedName(value="disabled_mass_mentions")
    val disabledMassMentions: BaseBoolInt? = null
)
