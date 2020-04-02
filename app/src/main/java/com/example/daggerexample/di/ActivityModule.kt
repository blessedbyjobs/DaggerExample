package com.example.daggerexample.di

import com.example.daggerexample.MainActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private var activity: MainActivity) {

    @Provides
    @ActivityScope
    fun providesActivity(): MainActivity = activity
}