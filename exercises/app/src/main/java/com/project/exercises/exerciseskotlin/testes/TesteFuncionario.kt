package com.project.exercises.exerciseskotlin.testes

import com.project.exercises.exerciseskotlin.Funcionario
import com.project.exercises.exerciseskotlin.Pessoa
import java.math.BigDecimal

fun main() {
    val pessoa = Pessoa(nome = "Hilton Coutinho", cpf = "111.222.333.45")

    println(pessoa.nome)
    println(pessoa.cpf)

    val funcionario = Funcionario("Hilton Coutinho", "111.222.333-45", BigDecimal.valueOf(2000.0))
    println(funcionario.nome)
    println(funcionario.cpf)
    println(funcionario.salario)
}