package com.dioses.dailypulse.di

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.dsl.module

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.di
 * Created by Arthur Dioses Reto on 24/03/24 at 12:40 PM
 * All rights reserved 2024.
 ****/

val networkModule = module {
    single<HttpClient> {
        HttpClient {
            install(ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                })
            }
        }
    }
}