package bibliotecadigital.interfaces;

public interface IEmprestimo {
	public String getStatus();
	public void setStatus();
	public void atualizarEmprestimo();
	public void deletarEmprestimo();
}
