package com.project.exercises.exerciseskotlin.mentoria1

class ContaPessoaFisica(
    numero : Int,
    agencia: String
) {
    val _numeroConta = numero
    val _agencia = agencia

    init {
        println("num: $_numeroConta - agência: $_agencia")
    }
}

fun main() {
    val conta1 = ContaPessoaFisica(1234,"")

    var conta2 = ContaPessoaFisica()
}