package com.example.daggerexample.di

import android.app.Application
import com.example.daggerexample.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(dependencies = [], modules = [AppModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

    fun application(): Application
}