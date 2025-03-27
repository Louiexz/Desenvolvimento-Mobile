package com.example.myapplication.gerenciainvestimentos;

public interface IGerenciaInvestimento {
	void totalRetorno();
	void GetInvestimentos();
	void GetInvestimentosPorTipo(String tipo);
	void NovoInvestimento(String valor, String tipo);
	void DeletarInvestimento(String valor, String tipo);
}
