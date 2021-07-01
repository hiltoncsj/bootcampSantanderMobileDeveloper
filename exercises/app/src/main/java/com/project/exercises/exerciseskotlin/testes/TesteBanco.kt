package com.project.exercises.exerciseskotlin.testes

import com.project.exercises.exerciseskotlin.Banco

fun main() {
    val digiOneBank = Banco(nome="DigiOne",numero=12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
    println(digiOneBank.info())
}