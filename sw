[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Analista.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Analista.kt[m
[1mdeleted file mode 100644[m
[1mindex d64ced9..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Analista.kt[m
[1m+++ /dev/null[m
[36m@@ -1,11 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin[m
[31m-[m
[31m-import java.math.BigDecimal[m
[31m-[m
[31m-class Analista([m
[31m-    nome: String,[m
[31m-    cpf: String,[m
[31m-    salario: Double[m
[31m-) : Funcionario(nome, cpf, salario) {[m
[31m-    override fun calculoAuxilio() = salario * 0.1[m
[31m-}[m
\ No newline at end of file[m
[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Banco.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Banco.kt[m
[1mdeleted file mode 100644[m
[1mindex 35c9792..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Banco.kt[m
[1m+++ /dev/null[m
[36m@@ -1,10 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin[m
[31m-[m
[31m-import android.icu.text.IDNA[m
[31m-[m
[31m-data class Banco([m
[31m-    val nome : String,[m
[31m-    val numero : Int[m
[31m-){[m
[31m-    fun info() = "$nome - $numero"[m
[31m-}[m
[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/ChaveAcesso.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/ChaveAcesso.kt[m
[1mdeleted file mode 100644[m
[1mindex 4ebea65..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/ChaveAcesso.kt[m
[1m+++ /dev/null[m
[36m@@ -1,5 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin[m
[31m-[m
[31m-interface ChaveAcesso {[m
[31m-    fun login() : Boolean[m
[31m-}[m
\ No newline at end of file[m
[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Cliente.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Cliente.kt[m
[1mdeleted file mode 100644[m
[1mindex 2fa22f3..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Cliente.kt[m
[1m+++ /dev/null[m
[36m@@ -1,16 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin[m
[31m-[m
[31m-class Cliente([m
[31m-    nome: String,[m
[31m-    cpf: String,[m
[31m-    val clienteTipo: ClienteTipo,[m
[31m-    val senha : String[m
[31m-) : Pessoa(nome, cpf), ChaveAcesso {[m
[31m-    override fun login(): Boolean = "123456" == senha[m
[31m-[m
[31m-    override fun toString(): String = """[m
[31m-        Nome    :         $nome[m
[31m-        CPF     :         $cpf[m
[31m-        Tipo    :         ${clienteTipo.descricao}[m
[31m-    """.trimIndent()[m
[31m-}[m
\ No newline at end of file[m
[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/ClienteTipo.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/ClienteTipo.kt[m
[1mdeleted file mode 100644[m
[1mindex 2e6ec00..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/ClienteTipo.kt[m
[1m+++ /dev/null[m
[36m@@ -1,6 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin[m
[31m-[m
[31m-enum class ClienteTipo (val descricao : String) {[m
[31m-    PF("Pessoa Física"),[m
[31m-    PJ("Pessoa Jurídica")[m
[31m-}[m
\ No newline at end of file[m
[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Conta.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Conta.kt[m
[1mdeleted file mode 100644[m
[1mindex fba9a7b..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Conta.kt[m
[1m+++ /dev/null[m
[36m@@ -1,17 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin[m
[31m-[m
[31m-import java.math.BigDecimal[m
[31m-[m
[31m-class Conta([m
[31m-    val agencia : String,[m
[31m-    val numero : String,[m
[31m-    val saldo : BigDecimal[m
[31m-) {[m
[31m-    fun deposito(valor : BigDecimal) {[m
[31m-[m
[31m-    }[m
[31m-[m
[31m-    fun saque(valor : BigDecimal) {[m
[31m-[m
[31m-    }[m
[31m-}[m
\ No newline at end of file[m
[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Funcionario.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Funcionario.kt[m
[1mdeleted file mode 100644[m
[1mindex 08f471f..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Funcionario.kt[m
[1m+++ /dev/null[m
[36m@@ -1,18 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin[m
[31m-[m
[31m-import java.math.BigDecimal[m
[31m-[m
[31m-abstract class Funcionario([m
[31m-    nome : String,[m
[31m-    cpf : String,[m
[31m-    val salario : Double[m
[31m-) : Pessoa(nome, cpf) {[m
[31m-    protected abstract fun calculoAuxilio() : Double[m
[31m-[m
[31m-    override fun toString(): String = """[m
[31m-        Nome    : $nome[m
[31m-        CPF     : $cpf[m
[31m-        salario : $salario[m
[31m-        Auxilio : ${calculoAuxilio()}[m
[31m-    """.trimIndent()[m
[31m-}[m
\ No newline at end of file[m
[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Gerente.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Gerente.kt[m
[1mdeleted file mode 100644[m
[1mindex 1b94952..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Gerente.kt[m
[1m+++ /dev/null[m
[36m@@ -1,12 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin[m
[31m-[m
[31m-class Gerente([m
[31m-    nome: String,[m
[31m-    cpf: String,[m
[31m-    salario: Double,[m
[31m-    val senha : String[m
[31m-) : Funcionario (nome, cpf, salario), ChaveAcesso {[m
[31m-    override fun calculoAuxilio(): Double = salario * 0.4[m
[31m-[m
[31m-    override fun login(): Boolean = "senha123" == senha[m
[31m-}[m
\ No newline at end of file[m
[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Pessoa.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Pessoa.kt[m
[1mdeleted file mode 100644[m
[1mindex fe4e510..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/Pessoa.kt[m
[1m+++ /dev/null[m
[36m@@ -1,20 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin[m
[31m-[m
[31m-abstract class Pessoa ([m
[31m-    val nome : String,[m
[31m-    val cpf : String[m
[31m-        )[m
[31m-[m
[31m-    /*{[m
[31m-    var nome : String = "Hilton"[m
[31m-    var cpf : String = "111.222.333-45"[m
[31m-    private set[m
[31m-[m
[31m-    constructor()[m
[31m-[m
[31m-    fun pessoaInfo() = "$nome e $cpf"[m
[31m-[m
[31m-    //inner class Endereco{[m
[31m-    //    var rua : String = "Rua Pinto Júnior"[m
[31m-    //}[m
[31m-    }*/[m
[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteAutenticacao.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteAutenticacao.kt[m
[1mdeleted file mode 100644[m
[1mindex 1113892..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteAutenticacao.kt[m
[1m+++ /dev/null[m
[36m@@ -1,7 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin.testes[m
[31m-[m
[31m-import com.project.exercises.exerciseskotlin.ChaveAcesso[m
[31m-[m
[31m-class TesteAutenticacao {[m
[31m-    fun autentica(chaveAcesso: ChaveAcesso) = println(chaveAcesso.login())[m
[31m-}[m
\ No newline at end of file[m
[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteBanco.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteBanco.kt[m
[1mdeleted file mode 100644[m
[1mindex a79941c..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteBanco.kt[m
[1m+++ /dev/null[m
[36m@@ -1,11 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin.testes[m
[31m-[m
[31m-import com.project.exercises.exerciseskotlin.Banco[m
[31m-[m
[31m-fun main() {[m
[31m-    val digiOneBank = Banco(nome="DigiOne",numero=12)[m
[31m-[m
[31m-    println(digiOneBank.nome)[m
[31m-    println(digiOneBank.numero)[m
[31m-    println(digiOneBank.info())[m
[31m-}[m
\ No newline at end of file[m
[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteCliente.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteCliente.kt[m
[1mdeleted file mode 100644[m
[1mindex 15e10cf..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteCliente.kt[m
[1m+++ /dev/null[m
[36m@@ -1,11 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin.testes[m
[31m-[m
[31m-import com.project.exercises.exerciseskotlin.Cliente[m
[31m-import com.project.exercises.exerciseskotlin.ClienteTipo[m
[31m-[m
[31m-fun main() {[m
[31m-    val jose = Cliente("José Maria", "555.555.555-66", ClienteTipo.PF, "123456")[m
[31m-[m
[31m-    println(jose)[m
[31m-    TesteAutenticacao().autentica(jose)[m
[31m-}[m
\ No newline at end of file[m
[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteClienteTipoEnum.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteClienteTipoEnum.kt[m
[1mdeleted file mode 100644[m
[1mindex 2435b56..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteClienteTipoEnum.kt[m
[1m+++ /dev/null[m
[36m@@ -1,19 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin.testes[m
[31m-[m
[31m-import com.project.exercises.exerciseskotlin.ClienteTipo[m
[31m-[m
[31m-fun main() {[m
[31m-    ClienteTipo.values().forEach {[m
[31m-        println( "${it.name} - ${it.descricao}" )[m
[31m-    }[m
[31m-[m
[31m-    ClienteTipo.values().forEach { elemento ->[m
[31m-        println( "${elemento.name} - ${elemento.descricao}" )[m
[31m-    }[m
[31m-[m
[31m-    val pf = ClienteTipo.PF[m
[31m-    println( ">> ${pf.name} - ${pf.descricao}" )[m
[31m-[m
[31m-    val pj = ClienteTipo.PF[m
[31m-    println( ">> ${pj.name} - ${pj.descricao}" )[m
[31m-}[m
\ No newline at end of file[m
[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteFuncionarioAnalista.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteFuncionarioAnalista.kt[m
[1mdeleted file mode 100644[m
[1mindex 04e93a1..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteFuncionarioAnalista.kt[m
[1m+++ /dev/null[m
[36m@@ -1,11 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin.testes[m
[31m-[m
[31m-import com.project.exercises.exerciseskotlin.Analista[m
[31m-import com.project.exercises.exerciseskotlin.Funcionario[m
[31m-import com.project.exercises.exerciseskotlin.Pessoa[m
[31m-import java.math.BigDecimal[m
[31m-[m
[31m-fun main() {[m
[31m-    val hilton = Analista("Hilton Coutinho", "111.222.333-45", 2000.0)[m
[31m-    imprimeRelatorioFuncionario.imprimeRelatorio(hilton)[m
[31m-}[m
\ No newline at end of file[m
[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteFuncionarioGerente.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteFuncionarioGerente.kt[m
[1mdeleted file mode 100644[m
[1mindex cfb69b9..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/TesteFuncionarioGerente.kt[m
[1m+++ /dev/null[m
[36m@@ -1,13 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin.testes[m
[31m-[m
[31m-import com.project.exercises.exerciseskotlin.Analista[m
[31m-import com.project.exercises.exerciseskotlin.ChaveAcesso[m
[31m-import com.project.exercises.exerciseskotlin.Funcionario[m
[31m-import com.project.exercises.exerciseskotlin.Gerente[m
[31m-[m
[31m-fun main() {[m
[31m-    val joao = Gerente("João Paulo", "222.222.333-45", 6000.0, "senha123")[m
[31m-    imprimeRelatorioFuncionario.imprimeRelatorio(joao)[m
[31m-    TesteAutenticacao().autentica(joao)[m
[31m-}[m
[31m-[m
[1mdiff --git a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/imprimeRelatorioFuncionario.kt b/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/imprimeRelatorioFuncionario.kt[m
[1mdeleted file mode 100644[m
[1mindex 73d10d3..0000000[m
[1m--- a/exercises/app/src/main/java/com/project/exercises/exerciseskotlin/testes/imprimeRelatorioFuncionario.kt[m
[1m+++ /dev/null[m
[36m@@ -1,10 +0,0 @@[m
[31m-package com.project.exercises.exerciseskotlin.testes[m
[31m-[m
[31m-import com.project.exercises.exerciseskotlin.Funcionario[m
[31m-[m
[31m-class imprimeRelatorioFuncionario {[m
[31m-[m
[31m-    companion object{[m
[31m-        fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())[m
[31m-    }[m
[31m-}[m
\ No newline at end of file[m
