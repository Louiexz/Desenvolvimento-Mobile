package plataformaeducacional.classe;

import java.util.Date;

public class Inscricao {
	protected String aluno;
	protected String curso;
	protected Date date;
	protected boolean ativo;
	protected String status = "Incompleto";
	
	public Inscricao(String aluno, String curso) {
		super();
		this.aluno = aluno;
		this.curso = curso;
		this.date = new Date();
	}
	
	public String getAluno() {
		return aluno;
	}
	public String getCurso() {
		return curso;
	}
	public Date getDate() {
		return date;
	}

	public boolean isAtivo() {
		return ativo;
	}
	
	public void setAtivo() {
		this.ativo = !ativo;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
