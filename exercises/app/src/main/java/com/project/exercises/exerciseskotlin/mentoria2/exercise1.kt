package com.project.exercises.exerciseskotlin.mentoria2

fun main() {
    val salario1 = 100.0
    val salario2 = 2000.0
    val salario3 = 1500.0

    val arraySalarios = DoubleArray(3)
    arraySalarios[0] = salario1
    arraySalarios[1] = salario2
    arraySalarios[2] = salario3

    var maiorSalario = 0.0
    /*for(salario in arraySalarios)
        if (salario > maiorSalario){
            maiorSalario = salario
        }*/

    for(indice in arraySalarios.indices)
        if (arraySalarios[indice] > maiorSalario){
            maiorSalario = arraySalarios[indice]
        }

    println("Maior salários: $maiorSalario")

    val somaTodosSalarios = arraySalarios.sum()
    println("Soma de salários: $somaTodosSalarios")
}