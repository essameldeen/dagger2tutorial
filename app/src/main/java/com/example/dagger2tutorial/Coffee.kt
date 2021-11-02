package com.example.dagger2tutorial

import android.util.Log
import javax.inject.*

@ActivityScope
class Coffee @Inject constructor(
    var  water: Water,
    @Sugar var sugar: Int,
    @Milk var milk: Int
) {

    @Inject
    lateinit var beans: Beans


    @Inject
    fun runMachine() {

        Log.d("essam", "machine running..")
    }

    fun getCoffeeCup(): String {
        return water.getWater() + "+" + beans.getBeans() + " Sugar: $sugar " + "milk: $milk"
    }

}