package br.com.fiap.banco.exception;

public class ValorInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String msg;
	
	public ValorInvalidoException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMessage() {
		return this.msg;
	}

}
