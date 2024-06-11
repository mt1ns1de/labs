package com.example.lab6

import android.app.Application
import android.util.Log

class Application: Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d("Application", "App is running")
    }
}