package com.example.daggerexample.di

import android.app.Application
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(dependencies = [], modules = [AppModule::class])
interface AppComponent {

    fun application(): Application
}