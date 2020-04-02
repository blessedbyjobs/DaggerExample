package com.example.daggerexample.di

import com.example.daggerexample.MainActivity
import com.example.daggerexample.MainPresenter
import com.example.daggerexample.MainPresenterInterface
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private var activity: MainActivity) {

    @Provides
    @ActivityScope
    fun providesActivity(): MainActivity = activity

    @Provides
    fun providePresenter(presenter: MainPresenter): MainPresenterInterface = presenter
}