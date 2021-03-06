package com.example.dagger2tutorial

import android.app.Application

class MainApplication : Application() {
    private lateinit var appComponent: AppComponent


    override fun onCreate() {
        super.onCreate()

        appComponent =
            DaggerAppComponent.create()
    }

     fun getAppComponent(): AppComponent {
        return appComponent
    }

}