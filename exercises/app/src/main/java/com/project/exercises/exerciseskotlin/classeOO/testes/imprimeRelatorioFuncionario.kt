package com.project.exercises.exerciseskotlin.classeOO.testes

import com.project.exercises.exerciseskotlin.classeOO.Funcionario

class imprimeRelatorioFuncionario {

    companion object{
        fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())
    }
}