package com.dioses.dailypulse.di

import app.cash.sqldelight.db.SqlDriver
import com.dioses.dailypulse.db.DatabaseDriverFactory
import dioses.dailypulse.db.DailyPulseDatabase
import org.koin.dsl.module

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.di
 * Created by Arthur Dioses Reto on 24/03/24 at 10:21 PM
 * All rights reserved 2024.
 ****/

val databaseModule = module {
    single<SqlDriver> { DatabaseDriverFactory().createDriver() }
    single<DailyPulseDatabase> { DailyPulseDatabase(get()) }
}