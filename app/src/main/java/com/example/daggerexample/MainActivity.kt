package com.example.daggerexample

import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggerexample.di.AppComponent
import com.example.daggerexample.di.AppModule
import com.example.daggerexample.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var appContext: Application

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getAppComponent().inject(this)
        Log.i("bruh", ::appContext.isInitialized.toString())
    }

    private fun getAppComponent(): AppComponent =
        DaggerAppComponent.builder()
        .appModule(AppModule(application))
        .build()
}
