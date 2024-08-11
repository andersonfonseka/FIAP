package br.com.fiap.banco;

public class Conta {

	private Banco banco;

	private Cliente cliente;

	private String numero;

	private double saldo = 0;

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Deposito no valor de " + valor);
	}
	
	public void sacar(double valor) {
		System.out.println("Saque solicitado no valor de " + valor);
		if (valor < this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado no valor de " + valor);
		} else {
			System.out.println("Saldo Insuficiente!!! O valor de " + valor + " eh maior que o saldo atual no valor de " + this.saldo);
		}
	}

	public void obterSaldo() {
		System.out.println(this.cliente.getNome() + " o seu saldo atual eh " + this.saldo);
	}

}
