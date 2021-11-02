package com.example.dagger2tutorial

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Beans @Inject constructor() {

    fun getBeans(): String {
        return "Beans"
    }
}