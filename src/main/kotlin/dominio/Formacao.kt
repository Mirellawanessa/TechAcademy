package dominio

data class Formacao(
    val nome: String,
    val nivel: String,
    val conteudosEducacionais: List<ConteudoEducacional>
) {
    private val alunosMatriculados: MutableList<Aluno> = mutableListOf()

    fun matricularAluno(aluno: Aluno) {
        alunosMatriculados.add(aluno)
    }

    fun listarAlunos(): List<Aluno> = alunosMatriculados
}
