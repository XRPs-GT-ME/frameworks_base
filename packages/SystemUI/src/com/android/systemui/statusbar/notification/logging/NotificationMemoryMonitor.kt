/*
 *
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.statusbar.notification.logging

import android.util.Log
import com.android.systemui.CoreStartable
import com.android.systemui.dagger.SysUISingleton
import dagger.Lazy
import javax.inject.Inject

/** This class monitors and logs current Notification memory use. */
@SysUISingleton
class NotificationMemoryMonitor
@Inject
constructor(
    private val notificationMemoryDumper: NotificationMemoryDumper,
    private val notificationMemoryLogger: Lazy<NotificationMemoryLogger>,
) : CoreStartable {

    companion object {
        private const val TAG = "NotificationMemory"
    }

    override fun start() {
        Log.d(TAG, "NotificationMemoryMonitor initialized.")
        notificationMemoryDumper.init()
        notificationMemoryLogger.get().init()
    }
}
