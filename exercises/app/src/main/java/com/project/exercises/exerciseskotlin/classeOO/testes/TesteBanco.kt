package com.project.exercises.exerciseskotlin.classeOO.testes

import com.project.exercises.exerciseskotlin.classeOO.Banco

fun main() {
    val digiOneBank = Banco(nome="DigiOne",numero=12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
    println(digiOneBank.info())
}