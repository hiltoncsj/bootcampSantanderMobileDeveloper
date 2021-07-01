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

        var currentYear = "Que ano é esse?"
        currentYear = 2021.toString() + " vai ser melhor"
        println(currentYear)

        var month : Int? = 12
        month = null
        println (month)

        val num1 = 10
        val num2 = 9
        val r = num1 + num2
        println( r )
        println( num1.plus(num2) )
    }
}