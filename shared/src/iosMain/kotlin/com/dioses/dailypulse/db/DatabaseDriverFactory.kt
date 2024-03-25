package com.dioses.dailypulse.db

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import dioses.dailypulse.db.DailyPulseDatabase

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.db
 * Created by Arthur Dioses Reto on 24/03/24 at 8:34 PM
 * All rights reserved 2024.
 ****/
actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver = NativeSqliteDriver(
        schema = DailyPulseDatabase.Schema,
        name = "DailyPulseDatabase.db"
    )
}