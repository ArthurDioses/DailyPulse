package com.dioses.dailypulse.db

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import dioses.dailypulse.db.DailyPulseDatabase

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.db
 * Created by Arthur Dioses Reto on 24/03/24 at 8:27 PM
 * All rights reserved 2024.
 ****/
actual class DatabaseDriverFactory(private val context: Context) {
    actual fun createDriver(): SqlDriver = AndroidSqliteDriver(
        schema = DailyPulseDatabase.Schema,
        context = context,
        name = "DailyPulseDatabase.db"
    )
}