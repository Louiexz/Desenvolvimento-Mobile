package plataformaeducacional.excecao;

public class LimiteMaximoInscricoesException extends Exception {
	private static final long serialVersionUID = 845188670231467333L;
	
	public LimiteMaximoInscricoesException(String msg) {
		super(msg);
	}
	public LimiteMaximoInscricoesException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
