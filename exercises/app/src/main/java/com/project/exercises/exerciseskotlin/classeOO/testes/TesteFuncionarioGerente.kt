package com.project.exercises.exerciseskotlin.classeOO.testes

import com.project.exercises.exerciseskotlin.classeOO.Gerente

fun main() {
    val joao = Gerente("João Paulo", "222.222.333-45", 6000.0, "senha123")
    imprimeRelatorioFuncionario.imprimeRelatorio(joao)
    TesteAutenticacao().autentica(joao)
}

