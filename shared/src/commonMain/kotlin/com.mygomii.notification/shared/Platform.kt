package com.mygomii.notification.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform


