package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2500.0, "CLT")
    val joana = Funcionario("Joana", 6500.0, "PJ")
    val mario = Funcionario("Mário", 5500.0, "CLT")

    println("------------LIST------------")
    val funcionario1 = mutableListOf(joao, mario)
    funcionario1.forEach { println(it) }

    println("------------------------")
    funcionario1.add(joana)
    funcionario1.forEach { println(it) }

    println("------------------------")
    funcionario1.remove(mario)
    funcionario1.forEach { println(it) }

    println("------------SET------------")
    val funcionarioSet = mutableSetOf(joana)
    funcionarioSet.forEach { println(it) }

    println("------------------------")
    funcionarioSet.add( mario )
    funcionarioSet.add( joao )
    funcionarioSet.forEach { println(it) }

    println("------------------------")
    funcionarioSet.remove( joana )
    funcionarioSet.forEach { println(it) }
}