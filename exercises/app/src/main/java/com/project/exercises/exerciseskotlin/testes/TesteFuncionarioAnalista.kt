package com.project.exercises.exerciseskotlin.testes

import com.project.exercises.exerciseskotlin.Analista
import com.project.exercises.exerciseskotlin.Funcionario
import com.project.exercises.exerciseskotlin.Pessoa
import java.math.BigDecimal

fun main() {
    val hilton = Analista("Hilton Coutinho", "111.222.333-45", 2000.0)
    imprimeRelatorioFuncionario.imprimeRelatorio(hilton)
}