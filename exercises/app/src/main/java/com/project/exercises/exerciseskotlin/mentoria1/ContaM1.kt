package com.project.exercises.exerciseskotlin.mentoria1

class ContaM1 (
    val numero: Int,
    val agencia: String,
    private var _saldo: Double
) {
    fun getSaldo() : Double {
        return _saldo
    }
}