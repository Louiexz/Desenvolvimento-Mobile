package com.example.myapplication.gerenciafinancas;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;

public class GerenciaFinanca implements IGerenciaFinanca {
	protected ArrayList<HashMap<String, String>> transacoes;

	@Override
	public void CalcularSaldo() {
		try {
			double saldo = 0;
			for (HashMap<String, String> c : transacoes) {
				if (c.get("Despesa") != null) {
					saldo -= Double.parseDouble(c.get("Despesa"));
				} else if(c.get("Receita") != null) {
					saldo += Double.parseDouble(c.get("Receita"));
				}
			}
			Log.i("Saldo: ", String.valueOf(saldo));
		} catch(Exception e) {
			Log.e("Erro: ", String.valueOf(e));
		}
	}

	@Override
	public void GetReceitas() {
		try {			
			transacoes.stream()
				.filter(c -> c.get("Receita") != null)
				.forEach(c -> Log.i("Receita: ", c.toString()));		
		} catch(Exception e) {
			Log.e("Erro: ", String.valueOf(e));
		}
	}

	@Override
	public void GetDespesas() {
		try{ 
			transacoes.stream()
	    		.filter(c -> c.get("Despesa") != null)
	    		.forEach(c -> Log.i("Despesa: ", c.toString()));
		} catch(Exception e) {
			Log.e("Erro: ", String.valueOf(e));
		}
	}

	@Override
	public void GetTodasTransacoes() {
		try {
			Log.i("Transacoes: ", String.valueOf(transacoes));
		} catch(Exception e) {
			Log.e("Erro: ", String.valueOf(e));
		}
	}

	@Override
	public void NovaTransacao(String tipo, String valor, String item) {
		try {
			HashMap<String, String> transacao = new HashMap<>();
			
			transacao.put(tipo, valor);
			transacao.put("Item", item);
			
			transacoes.add(transacao);
		} catch(Exception e) {
			Log.e("Erro: ", String.valueOf(e));
		}
	}
	
	@Override
	public void DeletarTransacao(String item) {
		try {
			transacoes.stream()
				.filter(c -> item.equals(c.get("item")))
				.forEach(c -> transacoes.remove(c));
		} catch(Exception e) {
			Log.e("Erro: ", String.valueOf(e));
		}
	}
}
