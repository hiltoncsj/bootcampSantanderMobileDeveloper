package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2500.0, "CLT")
    val joana = Funcionario("Joana", 6500.0, "PJ")
    val mario = Funcionario("Mário", 5500.0, "CLT")

    val funcionarios = listOf(joao, mario, joana)
    funcionarios.forEach { println(it) }

    println("------------------------")
    println( funcionarios.find { it.nome == "Maria" } )

    println("------------------------")
    println( funcionarios.find { it.nome == "Mário" } )

    println("------------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("------------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }
}