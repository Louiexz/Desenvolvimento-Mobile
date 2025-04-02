package com.example.myapplication.platafomaeducacional.classe;

import android.util.Log;

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
	public void NovoAluno(String nome, String senha, String email) {
		try {
			Aluno alunoLocal = new Aluno(nome, senha, email);
			alunos.add(alunoLocal);
			Log.i("Aluno: ", "O aluno foi registrado.");
		} catch (Exception e){
			Log.i("Aluno: ", "O aluno não foi registrado.");
		}
	}
	
	@Override
	public void NovoCurso(int valor, int limiteInscricoes,
						  String autor, String titulo) {
		try {
			Curso cursoLocal = new Curso(valor, limiteInscricoes, autor, titulo);
			cursos.add(cursoLocal);
			Log.i("Curso: ", "O curso foi registrado.");
		} catch (Exception e){
			Log.i("Curso: ", "O curso não foi registrado.");
		}
	}

	@Override
	public void InscreverAluno(String aluno, String curso)
			throws LimiteMaximoInscricoesException {
		if (getInscricao(aluno, curso)) {
			Log.i("Inscrição: ", "O aluno já está inscrito.");
		} else {
			Curso cursoLocal = verificarCurso(curso);
			LimiteMaximoInscricoes(cursoLocal);
			if (cursoLocal != null) {
				Inscricao novaInscricao = new Inscricao(aluno, curso);

				alunosInscricoes.add(novaInscricao);
				Log.i("Inscrição: ", "O aluno foi inscrito.");
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
