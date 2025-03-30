package bibliotecadigital.interfaces;

public interface IAluno {
    void deletarAluno();
    void lerAluno();
    void atualizarAluno();

    String getStatus(); //Prioridade
    void setStatus(); //Prioridade
}
