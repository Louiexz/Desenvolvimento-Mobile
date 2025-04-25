package com.example.myapplication.gerenciainvestimentos;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public abstract class GerenciaInvestimento implements IGerenciaInvestimento {
	protected ArrayList<HashMap<String, String>> investimentos = new ArrayList<>();

	@Override
	public void totalRetorno() {
		try {
			double valor = 0;
			for (HashMap<String, String> c : investimentos) {
				if (c.get("Valor") != null) {
					valor -= Double.parseDouble(Objects.requireNonNull(c.get("Valor")));
				}
			}
			Log.i("Valor de retorno: ", String.valueOf(valor));
		} catch(Exception e) {
			Log.i("Erro: ", String.valueOf(e));
		}
	}

	@Override
	public void GetInvestimentos() {
		try {
			Log.i("Investimentos: ", String.valueOf(investimentos));
		} catch(Exception e) {
			Log.i("Erro: ", String.valueOf(e));
		}		
	}

	@Override
	public void GetInvestimentosPorTipo(String tipo) {
		try {
			investimentos.stream()
				.filter(c -> tipo.equals(c.get("Tipo")))
				.forEach(c -> Log.i("Investimento: ", String.valueOf(c)));
		} catch(Exception e) {
			Log.e("Erro: ", String.valueOf(e));
		}
	}

	@Override
	public void NovoInvestimento(String valor, String tipo) {
		try{
			HashMap<String, String> investimento = new HashMap<>();
			
			investimento.put("Valor", valor);
			investimento.put("Tipo", tipo);
			
			Log.i("Investimento criado: ", investimento.toString());
			
			investimentos.add(investimento);
		} catch(Exception e) {
			Log.e("Erro: ", String.valueOf(e));
		}
		
	}

	@Override
	public void DeletarInvestimento(String valor, String tipo) {
		try {
			investimentos.stream()
				.filter(c -> tipo.equals(c.get("Tipo")) && valor.equals(c.get("Valor")))
				.forEach(c -> investimentos.remove(c));
			
			Log.i("Investimento: ", "deletado");
		} catch(Exception e) {
			Log.e("Erro: ", String.valueOf(e));
		}
	}
	
	
}
