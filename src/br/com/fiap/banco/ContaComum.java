package br.com.fiap.banco;

import br.com.fiap.banco.exception.SaldoInsuficienteException;

public class ContaComum {

	private Banco banco;

	private Cliente cliente;
	
	private Agencia agencia;

	private String numero;

	private double saldo = 0;
	
		
	public ContaComum(Banco banco, Cliente cliente, Agencia agencia, String numero, double saldo) {
		super();
		this.banco = banco;
		this.cliente = cliente;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public ContaComum(Banco banco, Cliente cliente, Agencia agencia, String numero) {
		this(banco, cliente, agencia, numero, 0);
	}

	public Banco getBanco() {
		return banco;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public Agencia getAgencia() {
		return agencia;
	}

	
	public String getNumero() {
		return numero;
	}


	public double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//Operacao de Negocio
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Deposito no valor de " + valor);
		} else {
			System.out.println("O valor informado para [deposito] deve ser maior que zero.");
		}
	}
	
	//Operacao de Negocio
	public void sacar(double valor) throws SaldoInsuficienteException {
		
		if (valor <= 0) {
			System.out.println("O valor informado para [saque] deve ser maior que zero.");
			return;
		}
		
		System.out.println("Saque solicitado no valor de " + valor);
		if (valor < this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado no valor de " + valor);
		} else {
			throw new SaldoInsuficienteException("Saldo Insuficiente!!! O valor de " + valor + " eh maior que o saldo atual no valor de " + this.saldo);
		}
	}

	//Operacao de Negocio
	public void obterSaldo() {
		System.out.println(this.cliente.getNome() + " o seu saldo atual eh " + this.saldo);
	}

}
