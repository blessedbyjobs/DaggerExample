package com.example.daggerexample

import android.app.Application
import android.util.Log
import com.example.daggerexample.di.ActivityScope
import com.example.daggerexample.di.App
import com.example.daggerexample.di.DaggerActivityComponent
import javax.inject.Inject

@ActivityScope
class MainPresenter @Inject constructor(application: Application) : MainPresenterInterface {

    override fun func() {
        Log.i("Presenter", "Hey!")
    }
}