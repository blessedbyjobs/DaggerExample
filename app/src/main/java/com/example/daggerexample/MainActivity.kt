package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerexample.di.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getActivityComponent().inject(this)
    }

    private fun getAppComponent(): AppComponent =
        DaggerAppComponent.builder()
            .appModule(AppModule(application))
            .build()

    private fun getActivityComponent(): ActivityComponent =
        DaggerActivityComponent.builder()
            .appComponent((applicationContext as App).appComponent)
            .build()
}
