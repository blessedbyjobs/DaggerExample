package com.example.daggerexample.di

import dagger.Component

@Component(dependencies = [AppComponent::class])
interface ActivityComponent