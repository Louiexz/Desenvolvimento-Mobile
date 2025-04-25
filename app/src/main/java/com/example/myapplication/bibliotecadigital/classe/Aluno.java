package com.example.myapplication.bibliotecadigital.classe;

import androidx.annotation.NonNull;

import com.example.myapplication.bibliotecadigital.interfaces.IAluno;

public class Aluno implements IAluno {
    protected boolean status = true;
    protected String nome;
    protected String senha;
    protected String curso;
    protected String email;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Aluno(String nome, String senha,
		String curso, String email) {
		this.nome = nome;
        this.senha = senha;
        this.curso = curso;
        this.email = email;
	}

	@Override
	public void deletarAluno() {}

	@Override
	public void lerAluno() {}

	@Override
	public void atualizarAluno() {}
	
	@Override
	public String getStatus(){
		return status ? "Ativo" : "Inativo";
	}
	@Override
    public void setStatus(){
		this.status = !this.status;
	}

	@NonNull
	@Override
	public String toString() {
		return "{" +
				"nome=" + nome +
				", curso=" + curso +
				", email=" + email +
				'}';
	}
}
