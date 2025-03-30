package bibliotecadigital.classe;

import bibliotecadigital.interfaces.ILivro;

public class Livro implements ILivro {
	protected int ano = 0;
	protected boolean status = true;
	protected String titulo = "";
	protected String autor = "";
	protected String genero = "";
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Livro(String titulo, String autor,
			String genero, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.ano = ano;
	}

	@Override
	public void deletarLivro() {}

	@Override
	public void lerLivro() {}

	@Override
	public void atualizarLivro() {}

	@Override
	public String getStatus() {
		return status ? "Disponível" : "Indisponível";
	}
	
	@Override
	public void setStatus() {
		this.status = !status;
	}
}
