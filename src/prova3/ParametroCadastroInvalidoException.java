package prova3;

public class ParametroCadastroInvalidoException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7834632266692717276L;

	public ParametroCadastroInvalidoException(String msg) {
		super(msg);
	}
	
	public ParametroCadastroInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

}
