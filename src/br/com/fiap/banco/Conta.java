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
	}

	public void obterSaldo() {
		System.out.println(this.banco.getNome());
		System.out.println("------------------------------------------");
		System.out.println("O saldo atual de " + this.cliente.getNome() + " é " + this.saldo + "\n\n");
	}

}
