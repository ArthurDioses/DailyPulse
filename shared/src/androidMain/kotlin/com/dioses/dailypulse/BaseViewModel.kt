package com.dioses.dailypulse

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse
 * Created by Arthur Dioses Reto on 20/03/24 at 12:25 PM
 * All rights reserved 2024.
 ****/

actual open class BaseViewModel : ViewModel() {
    actual val scope = viewModelScope
}