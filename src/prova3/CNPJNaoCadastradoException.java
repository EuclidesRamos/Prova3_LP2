package prova3;

public class CNPJNaoCadastradoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5352742220881273531L;
	
	public CNPJNaoCadastradoException(String msg) {
		super(msg);
	}
	
	public CNPJNaoCadastradoException(String message, Throwable cause) {
        super(message, cause);
    }

}
