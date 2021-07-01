package com.project.exercises.exerciseskotlin.testes

import com.project.exercises.exerciseskotlin.Analista
import com.project.exercises.exerciseskotlin.Funcionario
import com.project.exercises.exerciseskotlin.Gerente

fun main() {
    val joao = Gerente("João Paulo", "222.222.333-45", 6000.0)
    imprimeRelatorioFuncionario.imprimeRelatorio(joao)
}

