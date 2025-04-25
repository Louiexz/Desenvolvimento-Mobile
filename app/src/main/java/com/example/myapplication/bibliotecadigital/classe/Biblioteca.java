package com.example.myapplication.bibliotecadigital.classe;

import android.os.Build;
import android.util.Log;

import com.example.myapplication.bibliotecadigital.repositorio.BibliotecaDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Biblioteca extends BibliotecaDados {
	public void autenticarAluno(String credencial, String senha) {
		try {
			for (Aluno aluno : super.alunos) {			
				if (Objects.equals(aluno.nome, credencial) || Objects.equals(aluno.email, credencial)
						&& Objects.equals(aluno.senha, senha)) {
					Log.i("Autenticação: ",
							"Aluno " + aluno.nome.toLowerCase() + " logou no sistema.");
					break;
				}
			}
		} catch (Exception e) {
			Log.e("Erro, autenticação falha: ", String.valueOf(e));
		}
	}

	public void cadastrarAluno(String nome, String senha,
			String curso, String email) {
		try {
			Aluno alunoLocal = new Aluno(nome, senha,
					curso.toLowerCase(), email.toLowerCase());
			super.alunos.add(alunoLocal);
			Log.i("Cadastro: ", "Aluno cadastrado com sucesso.");
		}  catch (Exception e) {
			Log.e("Erro, cadastro falhou: ", String.valueOf(e));
		}
	}

	public void novoLivro(String titulo, String autor,
			String genero, int ano) {
		try{
			Livro livroLocal = new Livro(titulo.toLowerCase(), autor.toLowerCase()
					, genero.toLowerCase(), ano);
			super.livros.add(livroLocal);
			Log.i("Cadastro: ", "Livro registrado com sucesso.");
		} catch (Exception e) {
			Log.e("Erro, cadastro livro falhou: ", String.valueOf(e));
		}		
	}

	public Aluno getAluno(String nome) {
		Aluno alunoLocal = super.buscarAluno(nome);

		if (alunoLocal != null){
			Log.i("Busca: ", "Aluno: " + alunoLocal);
		} else {
			Log.i("Busca: ", "Aluno não encontrado");
		}
		return null;
	}

	public List<Livro> buscarLivros(String livro) {
		try {
			ArrayList livros = (ArrayList) super.buscarLivros(livro);

			if (!livros.isEmpty()){
				Log.i("Livros: ", String.valueOf(livros));
			} else {
				Log.i("Livros: ", "Livros não encontrados.");
			}
			return null;
		} catch (Exception e) {
			Log.e("Erro, busca de livro falhou: ", String.valueOf(e));
		}
		return null;
	}

	public void novoEmprestimo(String nomeAluno, String livro) {
		try {
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
				super.novoEmprestimo(nomeAluno, livro);
			}
		} catch (Exception e) {
			Log.e("Erro, emprestímo falhou: ", String.valueOf(e));
		}
	}

	public void devolverEmprestimo(String nomeAluno, String livro) {
		try{
			super.devolverEmprestimo(nomeAluno, livro);
		} catch (Exception e) {
			Log.e("Erro, devolução falhou: ", String.valueOf(e));
		}
	}
}
