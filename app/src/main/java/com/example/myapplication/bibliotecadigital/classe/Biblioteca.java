package bibliotecadigital.classe;

import java.util.ArrayList;

import bibliotecadigital.repositorio.BibliotecaDados;

public class Biblioteca extends BibliotecaDados {
	protected void autenticarAluno(String credencial, String senha) {
		try {
			for (Aluno aluno : super.alunos) {			
				if (aluno.nome == credencial || aluno.email == credencial
						&& aluno.senha == senha) {
					Log.i("Autenticação: ",
							"Aluno " + aluno.nome.toLowerCase() + " logou no sistema.");
					break;
				}
			}
		} catch (Exception e) {
			Log.e("Erro, autenticação falha: ", e);
		}
	};
	protected void cadastrarAluno(String nome, String senha,
			String curso, String email) {
		try {
			Aluno alunoLocal = new Aluno(nome.strip(), senha.strip(),
					curso.strip().toLowerCase(), email.strip().toLowerCase());
			super.alunos.add(alunoLocal);
		}  catch (Exception e) {
			Log.e("Erro, cadastro falhou: ", e);
		}
	};
	protected void novoLivro(String titulo, String autor,
			String genero, int ano) {
		try{
			Livro livroLocal = new Livro(titulo.strip().toLowerCase(), autor.strip().toLowerCase()
					, genero.strip().toLowerCase(), ano);
			super.livros.add(livroLocal);
		} catch (Exception e) {
			Log.e("Erro, novo livro falhou: ", e);
		}		
	};

	protected Livro buscarLivros(String livro) {
		try {
			Livro livroLocal = super.buscarLivros(livro.toLowerCase());
			Log.i("Livros: ", livroLocal.toString());
		} catch (Exception e) {
			Log.e("Erro, busca de livro falhou: ", e);
		}		
	}
	
	protected void novoEmprestimo(String nomeAluno, String livro) {		
		try {
			super.novoEmprestimo(nomeAluno, livro.toLowerCase());
		} catch (Exception e) {
			Log.e("Erro, emprestímo falhou: ", e);
		}
	}

	protected void devolverEmprestimo(String nomeAluno, String livro) {
		try{
			super.devolverEmprestimo(nomeAluno, livro.toLowerCase());
		} catch (Exception e) {
			Log.e("Erro, devolução falhou: ", e);
		}
	}
}
