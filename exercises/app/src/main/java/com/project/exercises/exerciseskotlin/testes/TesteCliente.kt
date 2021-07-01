package com.project.exercises.exerciseskotlin.testes

import com.project.exercises.exerciseskotlin.Cliente
import com.project.exercises.exerciseskotlin.ClienteTipo

fun main() {
    val jose = Cliente("José Maria", "555.555.555-66", ClienteTipo.PF, "123456")

    println(jose)
    TesteAutenticacao().autentica(jose)
}