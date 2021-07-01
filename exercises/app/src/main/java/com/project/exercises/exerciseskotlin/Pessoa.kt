package com.project.exercises.exerciseskotlin

class Pessoa {
    var nome : String = "Hilton"
    var cpf : String = "111.222.333-45"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

    //inner class Endereco{
    //    var rua : String = "Rua Pinto Júnior"
    //}
}

fun main() {
    val pessoa = Pessoa()
    //pessoa.cpf = "1234"

    println(pessoa.nome)
    println(pessoa.cpf)
    println(pessoa.pessoaInfo())
    //println(pessoa.Endereco().rua)
}