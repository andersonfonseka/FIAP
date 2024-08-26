package br.com.fiap.banco.entidades;

import br.com.fiap.banco.exception.SaldoInsuficienteException;
import br.com.fiap.banco.exception.ValorInvalidoException;

public abstract class Conta implements IConta {

	private Long id;
	
	private Banco banco;

	private Cliente cliente;

	private Agencia agencia;

	private String numero;

	private double saldo = 0;

	public Conta(Banco banco, Cliente cliente, Agencia agencia, String numero, double saldo) {
		super();
		this.banco = banco;
		this.cliente = cliente;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	// Operacao de Negocio
	public void depositar(double valor) {
		if (valor > 0) {
			setSaldo(getSaldo() + valor);
			System.out.println("Deposito no valor de " + valor);
		} else {
			System.out.println("O valor informado para [deposito] deve ser maior que zero.");
		}
	}

	public abstract void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException;

	public abstract void obterSaldo();

	public abstract boolean possuiSaldo(double valor);

	public abstract double getLimite();

	public void transferir(IConta contaDestino, double valor) {

		if (this.possuiSaldo(valor)) {

			try {
				this.sacar(valor);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			} catch (ValorInvalidoException e) {
				e.printStackTrace();
			}

			contaDestino.depositar(valor);

			System.out.println("Transferencia no valor de " + valor + " do(a) Conta da " + getCliente().getNome()
					+ " para a Conta do(a) " + contaDestino.getCliente().getNome());
		}

	}

}
