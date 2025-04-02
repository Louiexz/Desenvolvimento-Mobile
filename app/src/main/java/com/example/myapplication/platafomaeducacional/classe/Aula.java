package com.example.myapplication.platafomaeducacional.classe;

import java.util.Date;

import plataformaeducacional.interfaces.IAula;

public class Aula implements IAula {
	protected String titulo;
	protected String descricao;
    protected Date date;
    protected boolean status;

	@Override
	public void deletarAula() {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarAula() {
		// TODO Auto-generated method stub

	}

}
