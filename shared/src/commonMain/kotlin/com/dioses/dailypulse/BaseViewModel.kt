package com.dioses.dailypulse

import kotlinx.coroutines.CoroutineScope

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse
 * Created by Arthur Dioses Reto on 20/03/24 at 10:56 AM
 * All rights reserved 2024.
 ****/
expect open class BaseViewModel() {
    val scope: CoroutineScope
}