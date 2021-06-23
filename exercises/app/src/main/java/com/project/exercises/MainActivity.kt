package com.project.exercises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

const val MAX_AGE = 68

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var currentAge = 30
        currentAge = 40
        println(currentAge < MAX_AGE)
    }
}