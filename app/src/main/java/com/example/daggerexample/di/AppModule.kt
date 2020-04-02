package com.example.daggerexample.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private var appContext: Application) {

    @Provides
    @Singleton
    fun providesApplication(): Application {
        return appContext
    }
}