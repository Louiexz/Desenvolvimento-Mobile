package bibliotecadigital.interfaces;

public interface ILivro {
    void deletarLivro();
    void lerLivro();
    void atualizarLivro();
    
	String getStatus(); // Prioridade
	void setStatus(); // Prioridade
}
