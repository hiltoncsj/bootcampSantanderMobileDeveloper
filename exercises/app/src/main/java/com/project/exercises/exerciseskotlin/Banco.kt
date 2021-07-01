package com.project.exercises.exerciseskotlin

import android.icu.text.IDNA

data class Banco(
    val nome : String,
    val numero : Int
){
    fun info() = "$nome - $numero"
}
