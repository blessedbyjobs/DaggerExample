package com.example.daggerexample.di

import android.app.Application

class App : Application() {

    val appComponent: AppComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
}
