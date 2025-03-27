package com.example.myapplication.gerenciafinancas;

public interface IGerenciaFinanca {
	void CalcularSaldo();
	void GetReceitas();
	void GetDespesas();
	void GetTodasTransacoes();
	void NovaTransacao(String tipo, String valor, String item);
	void DeletarTransacao(String item);
}
