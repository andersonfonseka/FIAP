package br.com.fiap.banco.entidades;

import br.com.fiap.banco.exception.SaldoInsuficienteException;
import br.com.fiap.banco.exception.ValorInvalidoException;

public class ContaEspecial extends Conta {

	private double limite;

	public ContaEspecial(Banco banco, Cliente cliente, Agencia agencia, String numero, double limite) {
		this(banco, cliente, agencia, numero, 0,  limite);
		
	}
	
	public ContaEspecial(Banco banco, Cliente cliente, Agencia agencia, String numero, double saldo, double limite) {
		super(banco, cliente, agencia, numero, saldo);
		this.limite = limite;
		
	}

	public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
		
		if (valor <= 0) {
			throw new ValorInvalidoException("O valor informado para [saque] deve ser maior que zero.");
		}
		
		System.out.println("Saque solicitado no valor de " + valor);
		
		if (valor <= (super.getSaldo()+this.limite)) {
			super.setSaldo(super.getSaldo()-valor);
			System.out.println("Saque realizado no valor de " + valor);
		} else {
			throw new SaldoInsuficienteException("Saldo Insuficiente!!! O valor de " + valor + " excede o seu saldo atual + limite que eh de : " + (super.getSaldo() + this.limite));
		}
	}
	
	
	public void obterSaldo() {

		System.out.println(super.getCliente().getNome() + " o seu saldo atual eh " + (super.getSaldo() + this.limite));
		
		// if ternario - veremos nas aulas seguintes
		double limiteUtilizado = ((this.getLimite() - (super.getSaldo() + this.limite)) > 0) ? (this.getLimite() - (super.getSaldo() + this.limite)) : 0;
		
		System.out.println("Utilizando " +  limiteUtilizado + " do seu limite permitido!!");
	}

	@Override
	public boolean possuiSaldo(double valor) {
		return (getSaldo() + getLimite()) >= valor;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Banco : " + getBanco().getNome() + "\n");
		sb.append("Cliente : " + getCliente().getNome() + "\n");
		sb.append("Agencia : " + getAgencia() + "\n");
		sb.append("Conta : " + getNumero() + "\n");
		sb.append("Limite : " + getLimite() + "\n");
		
		return sb.toString();
	}
	
}
