package com.example.myapplication.gerenciacontatos;

public interface Contatos {
	void procurarContato(String contato);
    void novoContato(String nome, String telefone, String tipo);
    void deletarContato(String contato);
    void TodosOsContatos();
    void TodosOsContatosPorTipo(String tipo);
}
