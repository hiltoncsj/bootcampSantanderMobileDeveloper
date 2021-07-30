package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 2500.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }

    println("-------------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("-------------------")
    val salarios2 = doubleArrayOf(3000.0,4200.0,5125.0)
    salarios2.reverse()
    salarios2.forEach { println(it) }
}