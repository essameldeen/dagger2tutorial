package com.example.dagger2tutorial

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [WaterModule::class])
interface AppComponent {

    fun getCoffeeComponentBuilder(): CoffeeComponent.Builder

}