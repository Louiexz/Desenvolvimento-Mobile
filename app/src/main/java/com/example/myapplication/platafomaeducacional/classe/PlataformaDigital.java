package com.example.myapplication.platafomaeducacional.classe;

import com.example.myapplication.platafomaeducacional.interfaces.IPlatarforma;

import java.util.ArrayList;

import plataformaeducacional.excecao.LimiteMaximoInscricoesException;

public abstract class PlataformaDigital implements IPlatarforma {
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
	public boolean NovoAluno(String nome, String senha, String email) {
		if (verificarAluno(nome) != null){
			Aluno alunoLocal = new Aluno(nome, senha, email);
			alunos.add(alunoLocal);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean NovoCurso(int valor, int limiteInscricoes,
						  String autor, String titulo) {
		if (verificarCurso(titulo) != null) {
			Curso cursoLocal = new Curso(valor, limiteInscricoes, autor, titulo);

			cursos.add(cursoLocal);

			return true;
		}
		return false;
	}

	@Override
	public boolean InscreverAluno(String aluno, String curso)
			throws LimiteMaximoInscricoesException {
		if (!getInscricao(aluno, curso)) {
			Curso cursoLocal = verificarCurso(curso);

			if (cursoLocal != null) {
				LimiteMaximoInscricoes(cursoLocal);
				Inscricao novaInscricao = new Inscricao(aluno, curso);

				alunosInscricoes.add(novaInscricao);
				return true;
			}
		}
		return false;
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
	public Curso verificarCurso(String curso) {
		for (Curso cursoLocal : cursos) {
			if(cursoLocal.getTitulo() == curso) {
				return cursoLocal;
			}
		}
		return null;
	}

	private boolean getInscricao(String aluno, String curso) {
		for (Inscricao inscricaoLocal : alunosInscricoes) {
			if(inscricaoLocal.getAluno() == aluno
					&& inscricaoLocal.getCurso() == curso) {
				return true;
			}
		}
		
		return false;
	}
}
