package com.example.dagger2tutorial

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class WaterModule() {

    @Singleton
    @Provides
    fun provideWater(): Water {
        return Water()
    }

//
//    @Provides
//    fun provideSugar(): Int {
//        return sugar
//    }
}