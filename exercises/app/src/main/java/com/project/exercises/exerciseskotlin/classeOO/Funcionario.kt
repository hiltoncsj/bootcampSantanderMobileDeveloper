package com.project.exercises.exerciseskotlin.classeOO

abstract class Funcionario(
    nome : String,
    cpf : String,
    val salario : Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio() : Double

    override fun toString(): String = """
        Nome    : $nome
        CPF     : $cpf
        salario : $salario
        Auxilio : ${calculoAuxilio()}
    """.trimIndent()
}