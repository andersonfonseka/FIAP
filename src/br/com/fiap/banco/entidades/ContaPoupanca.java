package br.com.fiap.banco.entidades;

import br.com.fiap.banco.exception.SaldoInsuficienteException;
import br.com.fiap.banco.exception.ValorInvalidoException;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Banco banco, Cliente cliente, Agencia agencia, String numero, double saldo) {
		super(banco, cliente, agencia, numero, saldo);
		// TODO Auto-generated constructor stub
	}

	public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
		// TODO Auto-generated method stub
		
	}

	public void obterSaldo() {
		// TODO Auto-generated method stub
		
	}

	public double getLimite() {
		return 0;
	}

	@Override
	public boolean possuiSaldo(double valor) {
		// TODO Auto-generated method stub
		return false;
	}

}
