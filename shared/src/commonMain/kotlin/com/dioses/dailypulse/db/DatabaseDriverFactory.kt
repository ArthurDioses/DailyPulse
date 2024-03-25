package com.dioses.dailypulse.db

import app.cash.sqldelight.db.SqlDriver

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.db
 * Created by Arthur Dioses Reto on 24/03/24 at 8:26 PM
 * All rights reserved 2024.
 ****/
expect class DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}