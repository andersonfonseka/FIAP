package br.com.fiap.banco.entidades;

import br.com.fiap.banco.exception.SaldoInsuficienteException;
import br.com.fiap.banco.exception.ValorInvalidoException;

public interface IConta {
	
	public Cliente getCliente();
	
	public void depositar(double valor);
	
	public abstract void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException;
	
	public abstract void obterSaldo();
	
	public abstract double getLimite();
	
	public void transferir(IConta contaDestino, double valor);

}
