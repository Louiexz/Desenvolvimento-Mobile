package com.example.myapplication.gerenciafinancas;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class GerenciaFinanca implements IGerenciaFinanca {
	protected ArrayList<HashMap<String, String>> transacoes = new ArrayList<>();

	@Override
	public void CalcularSaldo() {
		try {
			double saldo = 0;
			for (HashMap<String, String> c : this.transacoes) {
				if (c.get("Despesa") != null) {
					saldo -= Double.parseDouble(Objects.requireNonNull(c.get("Despesa")));
				} else if(c.get("Receita") != null) {
					saldo += Double.parseDouble(Objects.requireNonNull(c.get("Receita")));
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
			this.transacoes.stream()
				.filter(c -> c.get("Receita") != null)
				.forEach(c -> Log.i("Receita: ", c.toString()));		
		} catch(Exception e) {
			Log.e("Erro: ", String.valueOf(e));
		}
	}

	@Override
	public void GetDespesas() {
		try{ 
			this.transacoes.stream()
	    		.filter(c -> c.get("Despesa") != null)
	    		.forEach(c -> Log.i("Despesa: ", c.toString()));
		} catch(Exception e) {
			Log.e("Erro: ", String.valueOf(e));
		}
	}

	@Override
	public void GetTodasTransacoes() {
		try {
			Log.i("Transacoes: ", String.valueOf(this.transacoes));
		} catch(Exception e) {
			Log.e("Erro: ", String.valueOf(e));
		}
	}

	@Override
	public void NovaTransacao(String tipo, String valor, String item) {
		try {
			HashMap<String, String> transacao = new HashMap<>();
			
			transacao.put("Tipo", tipo);
			transacao.put("Valor", valor);
			transacao.put("Item", item);
			
			this.transacoes.add(transacao);
		} catch(Exception e) {
			Log.e("Erro: ", String.valueOf(e));
		}
	}
	
	@Override
	public void DeletarTransacao(String item) {
		try {
			this.transacoes.stream()
				.filter(c -> item.equals(c.get("item")))
				.forEach(c -> transacoes.remove(c));
		} catch(Exception e) {
			Log.e("Erro: ", String.valueOf(e));
		}
	}
}
