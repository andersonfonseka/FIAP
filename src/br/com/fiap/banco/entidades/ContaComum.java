package br.com.fiap.banco.entidades;

import br.com.fiap.banco.exception.SaldoInsuficienteException;
import br.com.fiap.banco.exception.ValorInvalidoException;

public class ContaComum extends Conta {

	
	public ContaComum(Banco banco, Cliente cliente, Agencia agencia, String numero) {
		super(banco, cliente, agencia, numero, 0);
	}
	
	@Deprecated
	public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
		
		if (valor <= 0) {
			throw new ValorInvalidoException("O valor informado para [saque] deve ser maior que zero.");
		}
		
		System.out.println("Saque solicitado no valor de " + valor);
		
		if (valor <= getSaldo()) {
			setSaldo(getSaldo() - valor); ;
			System.out.println("Saque realizado no valor de " + valor);
		} else {
			throw new SaldoInsuficienteException("Saldo Insuficiente!!! O valor de " + valor + " eh maior que o saldo atual no valor de " + getSaldo());
		}
	}

	//Operacao de Negocio
	public void obterSaldo() {
		System.out.println(getCliente().getNome() + " o seu saldo atual eh " + getSaldo());
	}

	public double getLimite() {
		return 0;
	}

}
