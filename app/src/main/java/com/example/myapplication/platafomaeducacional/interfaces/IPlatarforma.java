package com.example.myapplication.platafomaeducacional.interfaces;

import com.example.myapplication.platafomaeducacional.classe.Aluno;
import com.example.myapplication.platafomaeducacional.classe.Curso;

import plataformaeducacional.excecao.LimiteMaximoInscricoesException;

public interface IPlatarforma {
	boolean InscreverAluno(String aluno, String curso) throws LimiteMaximoInscricoesException;
	boolean NovoAluno(String nome, String senha, String email);
	boolean NovoCurso(int valor, int limiteInscricoes, String autor, String titulo);
	Aluno verificarAluno(String aluno);

	Curso verificarCurso(String curso);
}
