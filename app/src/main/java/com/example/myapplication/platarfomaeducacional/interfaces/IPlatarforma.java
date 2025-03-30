package plataformaeducacional.interfaces;

import plataformaeducacional.classe.Aluno;
import plataformaeducacional.classe.Curso;
import plataformaeducacional.classe.Inscricao;
import plataformaeducacional.excecao.LimiteMaximoInscricoesException;

public interface IPlatarforma {
	void InscreverAluno(String aluno, String curso) throws LimiteMaximoInscricoesException;
	void NovoAluno(String nome, String senha, String email);
	void NovoCurso(int valor, int limiteInscricoes, String autor, String titulo);
	boolean getInscricao(String aluno, String curso);
	Aluno verificarAluno(String aluno);
	Curso verificarCurso(String curso) throws LimiteMaximoInscricoesException;
}
