package com.example.myapplication.bibliotecadigital.excecao;

public class ObjetoNaoEncontradoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public ObjetoNaoEncontradoException(String msg) {
		 super(msg);
	 }
	 public ObjetoNaoEncontradoException(String msg, Throwable cause) {
		 super(msg, cause);
	 }
}
