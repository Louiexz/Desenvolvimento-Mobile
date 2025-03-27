package com.example.myapplication.gerenciacontatos;

import android.util.Log;
import java.util.HashMap;

public class Profissional extends GerenciaContatos {
	@Override
    public void novoContato(String nome, String telefone, String tipo) {
        try {
            HashMap<String, String> contato = new HashMap<>();
            contato.put("Nome", nome);
            contato.put("Telefone", telefone);
            contato.put("Tipo", "profissional");
            
            super.listaContatos.add(contato);

            Log.i("Contato registrado: ", contato.toString());
        } catch(Exception e) {
			Log.e("Erro encontrado: ", String.valueOf(e));
		}
    }
		
    public void TodosOsContatosProfissionais() {
    	super.TodosOsContatosPorTipo("profissional");
    }
}
