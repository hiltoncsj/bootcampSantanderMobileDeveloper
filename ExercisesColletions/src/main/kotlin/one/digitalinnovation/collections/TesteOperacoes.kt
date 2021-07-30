package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2000.0, 3000.0)

    salarios.forEach { println(it) }

    println("-------------------------")
    println("Valor máximo: ${salarios.maxOrNull()}")
    println("Valor mínimo: ${salarios.minOrNull()}")
    println("Valor médio: ${salarios.average()}")

    println("-------------------------")
    val salariosMaioresQue1500 = salarios.filter { it > 1500 }
    salariosMaioresQue1500.forEach { println(it) }

    println("-------------------------")
    println(salarios.count { it in 1500.0..2500.0 })

    println("-------------------------")
    println(salarios.find { it == 2000.0 })
    println(salarios.find { it == 5000.0 })

    println("-------------------------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })
}