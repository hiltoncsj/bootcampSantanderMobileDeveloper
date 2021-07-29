package com.project.exercises.exerciseskotlin.classeOO.testes

import com.project.exercises.exerciseskotlin.classeOO.ChaveAcesso

class TesteAutenticacao {
    fun autentica(chaveAcesso: ChaveAcesso) = println(chaveAcesso.login())
}