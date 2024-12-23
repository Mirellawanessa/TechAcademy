package app

import dominio.Formacao
import dominio.Aluno
import dominio.ConteudoEducacional

fun main() {
    val conteudo1 = ConteudoEducacional("Kotlin Básico", "Introdução ao Kotlin", 20)
    val conteudo2 = ConteudoEducacional("Kotlin Avançado", "Técnicas avançadas em Kotlin", 30)

    val formacao = Formacao("Desenvolvedor Kotlin", "Intermediário", listOf(conteudo1, conteudo2))

    val aluno1 = Aluno("João Silva", 25, "joao.silva@email.com")
    val aluno2 = Aluno("Maria Oliveira", 30, "maria.oliveira@email.com")

    formacao.matricularAluno(aluno1)
    formacao.matricularAluno(aluno2)

    println("Alunos matriculados na formação ${formacao.nome}:")
    formacao.listarAlunos().forEach { aluno ->
        println("${aluno.nome} - ${aluno.email}")
    }
}
