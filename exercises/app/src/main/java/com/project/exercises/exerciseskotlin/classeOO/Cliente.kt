package com.project.exercises.exerciseskotlin.classeOO

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha : String
) : Pessoa(nome, cpf), ChaveAcesso {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome    :         $nome
        CPF     :         $cpf
        Tipo    :         ${clienteTipo.descricao}
    """.trimIndent()
}