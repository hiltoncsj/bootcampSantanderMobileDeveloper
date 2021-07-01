package com.project.exercises.exerciseskotlin.testes

import com.project.exercises.exerciseskotlin.ChaveAcesso

class TesteAutenticacao {
    fun autentica(chaveAcesso: ChaveAcesso) = println(chaveAcesso.login())
}