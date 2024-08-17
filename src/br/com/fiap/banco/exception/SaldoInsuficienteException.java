package br.com.fiap.banco.exception;

public class SaldoInsuficienteException extends Exception {

	private String msg;
	
	public SaldoInsuficienteException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMessage() {
		return this.msg;
	}
	
	
	

}
