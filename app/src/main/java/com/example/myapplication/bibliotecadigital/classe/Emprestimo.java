package com.example.myapplication.bibliotecadigital.classe;

import bibliotecadigital.interfaces.IEmprestimo;

import java.time.LocalDateTime;

public class Emprestimo implements IEmprestimo {
	protected String aluno;
	protected String livro;
	protected LocalDateTime date;
	protected boolean status;
	
	public String getAluno() {
		return aluno;
	}
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	public String getLivro() {
		return livro;
	}
	public void setLivro(String livro) {
		this.livro = livro;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Emprestimo(String aluno, String livro) {
		this.aluno = aluno;
		this.livro = livro;
		this.date = LocalDateTime.now();
	}
	@Override
	public String getStatus() {
		return status ? "Emprestado" : "Devolvido";
	}
	@Override
	public void setStatus() {
		this.status = !status;
	}
	@Override
	public void atualizarEmprestimo() {}
	@Override
	public void deletarEmprestimo() {}
}
