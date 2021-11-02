package com.example.dagger2tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var coffee: Coffee

    @Inject
    lateinit var coffee2: Coffee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var appComponent: AppComponent = (application as MainApplication).getAppComponent()
        var coffeeComponent = appComponent.getCoffeeComponentBuilder().milk(4)
            .sugar(5).build()
        coffeeComponent.inject(this)


        Log.d(
            "essam2",
            "coffee1: " + coffee + "\n" +
                    "coffee2 : " + coffee2 + "\n"
                    + coffee.water + "\n" + coffee2.water
        )
    }
}