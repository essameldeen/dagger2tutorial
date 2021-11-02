package com.example.dagger2tutorial

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Water @Inject constructor() {
    fun getWater(): String {
        return "Water"
    }
}