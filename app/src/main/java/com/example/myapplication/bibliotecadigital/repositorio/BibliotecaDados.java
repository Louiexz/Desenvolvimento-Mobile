package bibliotecadigital.repositorio;

import java.util.ArrayList;

import bibliotecadigital.classe.Aluno;
import bibliotecadigital.classe.Emprestimo;
import bibliotecadigital.classe.Livro;
import bibliotecadigital.excecao.ObjetoNaoEncontradoException;

public abstract class BibliotecaDados {
	protected int LIMITE_EMPRESTIMO_DIAS = 0;
	protected int LIMITE_LIVRO_EMPRESTADOS = 0;
	
	protected ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	protected ArrayList<Livro> livros = new ArrayList<Livro>();
	protected ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
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
			if (aluno.getNome() == nome) {
				return aluno;
			}
		}
		return null;
	}
	protected Livro buscarLivrosPorAno(int ano) {
		for (Livro livro : livros) {
			if (livro.getAno() == ano) {
				return livro;
			}
		}
		return null;
	}
	protected Livro buscarLivrosPorAutor(String autor) {
		for (Livro livro : livros) {
			if (livro.getAutor() == autor) {
				return livro;
			}
		}
		return null;
	}
	protected Livro buscarLivrosPorGenero(String genero) {
		for (Livro livro : livros) {
			if (livro.getGenero() == genero) {
				return livro;
			}
		}
		return null;
	}
	protected Livro buscarLivrosPorTitulo(String titulo) {
		for (Livro livro : livros) {
			if (livro.getTitulo() == titulo) {
				return livro;
			}
		}
		return null;
	}
	protected Livro buscarLivros(String livro) {		
		ArrayList<Livro> livrosEncontrados = new ArrayList<Livro>();
		
		try {
			Livro porAno = buscarLivrosPorAno(Integer.parseInt(livro));
			livrosEncontrados.add(porAno);
			
		} catch (NumberFormatException e) {
			Log.e("Erro: ", e);

			// Se não for um número, tenta buscar por título, autor ou gênero
			Livro porTitulo = buscarLivrosPorTitulo(livro);
			Livro porGenero = buscarLivrosPorGenero(livro);
			Livro porAutor = buscarLivrosPorAutor(livro);
			
			livrosEncontrados.add(porGenero);
			livrosEncontrados.add(porAutor);
			livrosEncontrados.add(porTitulo);		
		}
		for (Livro livroLocal : livrosEncontrados) {
			if (livroLocal != null) {
				return livroLocal;
			}
		}
		return null;
	}
	protected void novoEmprestimo(String nomeAluno, String livro) throws ObjetoNaoEncontradoException {	
		Aluno aluno = buscarAluno(nomeAluno);
		Livro livroLocal = buscarLivros(livro);
		
		if (livroLocal != null && aluno != null && livroLocal.isStatus()) {							
			livroLocal.setStatus();
			
			Emprestimo emprestimo = new Emprestimo(aluno.getNome(),
					livroLocal.getTitulo());
			emprestimo.setStatus();
			
			emprestimos.add(emprestimo);
		} else {
			DoesNotExist(livro);
		}
	}

	protected void devolverEmprestimo(String nomeAluno, String livro) throws ObjetoNaoEncontradoException {
		Aluno aluno = buscarAluno(nomeAluno);
		Livro livroLocal = buscarLivros(livro);
		
		if (livroLocal != null && aluno != null && !livroLocal.isStatus()) {	
			livroLocal.setStatus();
			
			for (Emprestimo emprestimo : emprestimos) {
				if (emprestimo.getLivro() == livroLocal.getTitulo()) {
					emprestimo.setStatus();
					break;
				}
			}
		} else {
			DoesNotExist(livro);
		}
	}
}
