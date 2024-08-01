package com.mygomii.notification.composeApp

import android.app.Application

class NotificationApp : Application() {

    override fun onCreate() {
        super.onCreate()

        AppInitializer.onApplicationStart()
    }
}