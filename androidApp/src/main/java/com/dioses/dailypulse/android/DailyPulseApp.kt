package com.dioses.dailypulse.android

import android.app.Application
import com.dioses.dailypulse.android.di.databaseModule
import com.dioses.dailypulse.android.di.viewModelsModule
import com.dioses.dailypulse.di.sharedKoinModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.android
 * Created by Arthur Dioses Reto on 24/03/24 at 1:21 PM
 * All rights reserved 2024.
 ****/
class DailyPulseApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        val modules = sharedKoinModule + viewModelsModule + databaseModule
        startKoin {
            androidContext(this@DailyPulseApp)
            modules(modules)
        }
    }
}