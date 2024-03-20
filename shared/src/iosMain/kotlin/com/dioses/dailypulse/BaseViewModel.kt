package com.dioses.dailypulse

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.cancel

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse
 * Created by Arthur Dioses Reto on 20/03/24 at 12:25 PM
 * All rights reserved 2024.
 ****/

actual open class BaseViewModel {
    actual val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)

    fun clear() {
        scope.cancel()
    }
}