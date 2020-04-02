package com.example.daggerexample

import android.app.Application
import com.example.daggerexample.di.ActivityScope
import com.example.daggerexample.di.App
import com.example.daggerexample.di.DaggerActivityComponent
import javax.inject.Inject

@ActivityScope
class MainPresenter @Inject constructor(application: Application) {

    init {
        DaggerActivityComponent.builder()
            .appComponent((application as App).appComponent)
            .build()
            .inject(this)
    }
}