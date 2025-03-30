package plataformaeducacional.classe;

import java.util.ArrayList;
import java.util.Date;

import plataformaeducacional.excecao.LimiteMaximoInscricoesException;
import plataformaeducacional.interfaces.IPlatarforma;

public class Plataforma implements IPlatarforma {
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	ArrayList<Inscricao> alunosInscricoes = new ArrayList<Inscricao>();
	
	protected void LimiteMaximoInscricoes(Curso curso) throws LimiteMaximoInscricoesException {
		if (curso.getNumeroInscricoes() >= curso.getLimiteInscricoes()) {					
			throw new LimiteMaximoInscricoesException(
					"O Curso" + curso.getTitulo() + " atingiu o limite de inscrições");
		}
	}
	
	@Override
	public void NovoAluno(String nome, String senha, String email) {
		Aluno alunoLocal = new Aluno(nome, senha, email);
		
		alunos.add(alunoLocal);
	}
	
	@Override
	public void NovoCurso(int valor, int limiteInscricoes,
			String autor, String titulo) {
		Curso cursoLocal = new Curso(valor, limiteInscricoes, autor, titulo);
		
		cursos.add(cursoLocal);
	}

	@Override
	public void InscreverAluno(String aluno, String curso) throws LimiteMaximoInscricoesException {
		if (getInscricao(aluno, curso)) {
			Log.i("Inscrição: ", "O aluno já está inscrito.");
		} else {
			if (verificarCurso(curso) != null) {	
				Inscricao novaInscricao = new Inscricao(aluno, curso);
				
				alunosInscricoes.add(novaInscricao);
			}
		}
	}
	
	@Override
	public Aluno verificarAluno(String aluno) {
		for (Aluno alunoLocal : alunos) {
			if(alunoLocal.getNome() == aluno) {
				return alunoLocal;
			}
		}
		return null;
	}
	
	@Override	
	public Curso verificarCurso(String curso) throws LimiteMaximoInscricoesException {
		for (Curso cursoLocal : cursos) {
			if(cursoLocal.getTitulo() == curso) {
				LimiteMaximoInscricoes(cursoLocal);
				
				return cursoLocal;
			}
		}
		return null;
	}

	@Override
	public boolean getInscricao(String aluno, String curso) {
		for (Inscricao inscricaoLocal : alunosInscricoes) {
			if(inscricaoLocal.getAluno() == aluno
					&& inscricaoLocal.getCurso() == curso) {
				return true;
			}
		}
		
		return false;
	}
}
