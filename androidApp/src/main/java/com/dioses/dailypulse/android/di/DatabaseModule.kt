package com.dioses.dailypulse.android.di

import app.cash.sqldelight.db.SqlDriver
import com.dioses.dailypulse.db.DatabaseDriverFactory
import dioses.dailypulse.db.DailyPulseDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.android.di
 * Created by Arthur Dioses Reto on 24/03/24 at 9:49 PM
 * All rights reserved 2024.
 ****/

val databaseModule = module {
    single<SqlDriver> { DatabaseDriverFactory(androidContext()).createDriver() }
    single<DailyPulseDatabase> { DailyPulseDatabase(get()) }
}