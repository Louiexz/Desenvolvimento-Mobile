package com.example.myapplication.bibliotecadigital.repositorio;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.myapplication.bibliotecadigital.classe.Aluno;
import com.example.myapplication.bibliotecadigital.classe.Emprestimo;
import com.example.myapplication.bibliotecadigital.classe.Livro;
import com.example.myapplication.bibliotecadigital.excecao.ObjetoNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class BibliotecaDados {
	protected int LIMITE_EMPRESTIMO_DIAS = 0;
	protected int LIMITE_LIVRO_EMPRESTADOS = 0;

	protected List<Aluno> alunos = new ArrayList<>();
	protected List<Livro> livros = new ArrayList<>();
	protected List<Emprestimo> emprestimos = new ArrayList<>();
	
	private void DoesNotExist(Object obj) throws ObjetoNaoEncontradoException {
		throw new ObjetoNaoEncontradoException("O objeto " + obj + " não foi encontrado.");
	}
	
	protected abstract void autenticarAluno(String credencial, String senha);
	protected abstract void cadastrarAluno(String nome, String senha,
			String curso, String email);
	protected abstract void novoLivro(String titulo, String autor,
			String genero, int ano);

	protected Aluno buscarAluno(String nome) {
		for (Aluno aluno : alunos) {
			if (Objects.equals(aluno.getNome(), nome)) {
				return aluno;
			}
		}
		return null;
	}
	protected List<Livro> buscarLivrosPorAno(int ano) {
		List<Livro> livrosEncontrados = new ArrayList<>();
		for (Livro livro : livros) {
			if (livro.getAno() == ano) {
				livrosEncontrados.add(livro);
			}
		}
		return livrosEncontrados;
	}

	protected List<Livro> buscarLivrosPorAutor(String autor) {
		List<Livro> livrosEncontrados = new ArrayList<>();
		for (Livro livro : livros) {
			if (livro.getAutor().equalsIgnoreCase(autor)) {
				livrosEncontrados.add(livro);
			}
		}
		return livrosEncontrados;
	}

	protected List<Livro> buscarLivrosPorGenero(String genero) {
		List<Livro> livrosEncontrados = new ArrayList<>();
		for (Livro livro : livros) {
			if (livro.getGenero().equalsIgnoreCase(genero)) {
				livrosEncontrados.add(livro);
			}
		}
		return livrosEncontrados;
	}

	protected List<Livro> buscarLivros(String livro) {
		List<Livro> livrosEncontrados = new ArrayList<>();

		try {
			// Try to parse the string to an integer (year)
			int ano = Integer.parseInt(livro);
			livrosEncontrados.addAll(buscarLivrosPorAno(ano));
		} catch (NumberFormatException e) {
			// If it's not a number, search by title, author, or genre
			Livro livroLocal = buscarLivro(livro);
			if (livroLocal != null){
				livrosEncontrados.add(livroLocal);
			}
			ArrayList livros = (ArrayList) buscarLivrosPorAutor(livro);
			if (!livros.isEmpty()){
				livrosEncontrados.addAll(livros);
			}
			livros = (ArrayList) buscarLivrosPorGenero(livro);
			if (!livros.isEmpty()){
				livrosEncontrados.addAll(livros);
			}
		}

		return livrosEncontrados;
	}

	protected Livro buscarLivro(String livro) {
		for (Livro livroLocal : livros){
			if (Objects.equals(livroLocal.getTitulo(), livro)){
				return livroLocal;
			}
		}

		return null;
	}

	protected Emprestimo buscarEmprestimo(String nomeAluno, String livro) {
		for (Emprestimo emprestimo : emprestimos){
			if (Objects.equals(emprestimo.getLivro(), livro) && Objects.equals(emprestimo.getAluno(), nomeAluno)){
				return emprestimo;
			}
		}

		return null;
	}


	@RequiresApi(api = Build.VERSION_CODES.O)
	protected void novoEmprestimo(String nomeAluno, String livro) throws ObjetoNaoEncontradoException {
		Aluno aluno = buscarAluno(nomeAluno);
		Livro livroLocal = buscarLivro(livro);

		if (livroLocal != null && aluno != null) {
			if (buscarEmprestimo(nomeAluno, livro) == null){
				livroLocal.setStatus();

				Emprestimo emprestimo = new Emprestimo(aluno.getNome(), livroLocal.getTitulo());
				emprestimo.setStatus();

				emprestimos.add(emprestimo);
			}
		} else {
			DoesNotExist(livro);
		}
	}

	protected void devolverEmprestimo(String nomeAluno, String livro) throws ObjetoNaoEncontradoException {
		Aluno aluno = buscarAluno(nomeAluno);
		Livro livroLocal = buscarLivro(livro);

		Emprestimo emprestimo = buscarEmprestimo(nomeAluno, livro);
		if (livroLocal != null && aluno != null) {
			if (emprestimo != null){
				emprestimo.setStatus();
			}
		} else {
			DoesNotExist(emprestimo);
		}
	}
}
