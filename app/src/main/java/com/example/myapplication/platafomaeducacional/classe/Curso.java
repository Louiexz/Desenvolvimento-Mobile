package com.example.myapplication.platafomaeducacional.classe;

import java.util.ArrayList;
import java.util.Date;

import plataformaeducacional.interfaces.ICurso;

public class Curso implements ICurso {
	protected boolean status;
	protected int valor;
	protected int limiteInscricoes;
	protected int numeroInscricoes;
	protected String autor;
	protected String titulo;
	protected Date date;
	ArrayList<Aula> aulas = new ArrayList<Aula>();

	@Override
	public String toString() {
		return "{" +
				"titulo='" + titulo + '\'' +
				", autor='" + autor + '\'' +
				", valor=" + valor +
				", limiteInscricoes=" + limiteInscricoes +
				", numeroInscricoes=" + numeroInscricoes +
				", date=" + date.toString() +
				", aulas=" + aulas +
				'}';
	}

	public Curso(int valor, int limiteInscricoes,
				 String autor, String titulo) {
		super();
		this.valor = valor;
		this.limiteInscricoes = limiteInscricoes;
		this.autor = autor;
		this.titulo = titulo;
		this.date = new Date();
	}
	
	boolean isStatus() {
		return status;
	}

	public void setStatus() {
		this.status = !status;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int getLimiteInscricoes() {
		return limiteInscricoes;
	}
	public int getNumeroInscricoes() {
		return numeroInscricoes;
	}
	public int aumentarNumeroInscricoes() {
		return numeroInscricoes += 1;
	}
	public int diminuirNumeroInscricoes() {
		return numeroInscricoes -= 1;
	}
	public String getAutor() {
		return autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public Date getDate() {
		return date;
	}
	public ArrayList<Aula> getAulas() {
		return aulas;
	}
	
	public void novaAula(Aula aula) {
		aulas.add(aula);
	}

	@Override
	public void deletarCurso() {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarCurso() {
		// TODO Auto-generated method stub

	}

}
