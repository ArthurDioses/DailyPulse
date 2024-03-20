package com.dioses.dailypulse

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform