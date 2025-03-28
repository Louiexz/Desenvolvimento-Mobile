package com.example.myapplication.gerenciacontatos;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class GerenciaContatos implements Contatos {
	protected ArrayList<HashMap<String, String>> listaContatos = new ArrayList<>();;
	
	public void procurarContato(String contato) {
    	try {
	    	for (HashMap<String, String> c : listaContatos) {
	    		if (c.get("Nome").equals(contato)
	            		|| c.get("Telefone").equals(contato)) {
	            	Log.i("Contato encontrado: ", String.valueOf(c));
	            	break;
	            }
	    	}
        } catch(Exception e) {
			Log.e("Erro encontrado: ", String.valueOf(e));
		}
    }
	
    public abstract void novoContato(String nome, String telefone, String tipo);

	public void deletarContato(String contato) {
    	try{
	    	for (HashMap<String, String> c : listaContatos) {
	            if (c.get("Nome").equals(contato)
	            		|| c.get("Telefone").equals(contato)) {
	            	Log.i("Contato removido: ", contato);
	            	
	            	listaContatos.remove(c);
	            	break;
	            }
	        }
    	} catch(Exception e) {
			Log.e("Erro encontrado: ", String.valueOf(e));
		}
    }

    public void TodosOsContatos() {
	
		try{			
			Log.i("Contatos encontrados: ", String.valueOf(listaContatos));
		} catch(Exception e) {
			Log.e("Erro encontrado: ", String.valueOf(e));
		}
    }
    
    public void TodosOsContatosPorTipo(String tipo) {
    	try{
    		listaContatos.stream()
	            .filter(c -> tipo.equals(c.get("Tipo")))
	            .forEach(c -> Log.i("Contato " + tipo + ": ", c.toString()));
    	} catch(Exception e) {
			Log.e("Erro: ", String.valueOf(e));
		}
    }
}
