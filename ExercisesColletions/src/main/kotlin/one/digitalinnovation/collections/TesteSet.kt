package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2500.0, "CLT")
    val joana = Funcionario("Joana", 6500.0, "PJ")
    val mario = Funcionario("Mário", 5500.0, "CLT")

    val funcionario1 = setOf(joao, mario)
    val funcionario2 = setOf(joana)

    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach { println(it) }

    println("------------------------")
    val funcionario3 = setOf(joao, mario, joana)
    val resultSubtract = funcionario3.subtract(funcionario2)
    resultSubtract.forEach { println(it) }

    println("------------------------")
    val resultIntersection = funcionario3.intersect(funcionario2)
    resultIntersection.forEach { println(it) }
}