package com.example.dagger2tutorial

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Milk
import javax.inject.Singleton
import javax.inject.Sugar

@ActivityScope
@Subcomponent()
interface CoffeeComponent {
    fun getCoffee(): Coffee

    fun inject(activity: MainActivity)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun sugar(@Sugar sugar: Int): Builder

        @BindsInstance
        fun milk(@Milk milk: Int): Builder




        fun build(): CoffeeComponent
    }

}