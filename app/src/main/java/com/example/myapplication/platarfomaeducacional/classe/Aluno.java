package plataformaeducacional.classe;

import plataformaeducacional.interfaces.IAluno;

public class Aluno implements IAluno {
	protected String nome;
	protected String senha;
	protected String email;
	protected boolean status;
	
	
	public Aluno(String nome, String senha, String email) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public void deletarAluno() {}
	
	@Override
	public void atualizarAluno() {}

}
