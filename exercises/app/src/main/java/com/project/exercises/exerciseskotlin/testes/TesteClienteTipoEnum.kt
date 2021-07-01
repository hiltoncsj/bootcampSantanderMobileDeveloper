package com.project.exercises.exerciseskotlin.testes

import com.project.exercises.exerciseskotlin.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        println( "${it.name} - ${it.descricao}" )
    }

    ClienteTipo.values().forEach { elemento ->
        println( "${elemento.name} - ${elemento.descricao}" )
    }

    val pf = ClienteTipo.PF
    println( ">> ${pf.name} - ${pf.descricao}" )

    val pj = ClienteTipo.PF
    println( ">> ${pj.name} - ${pj.descricao}" )
}