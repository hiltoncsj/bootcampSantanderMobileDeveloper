package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2500.0, "CLT")
    val joana = Funcionario("Joana", 6500.0, "PJ")
    val mario = Funcionario("Mário", 5500.0, "CLT")

    val repository = Repository<Funcionario>()
    repository.create(joao.nome, joao)
    repository.create(joana.nome, joana)
    repository.create(mario.nome, mario)

    println( repository.findById(joao.nome) )

    println("---------------------")
    repository.findAll().forEach { println(it) }

    println("---------------------")
    repository.remover(joana.nome)
    repository.findAll().forEach { println(it) }

}