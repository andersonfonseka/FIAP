package br.com.fiap.banco;

public class ContaEspecial extends ContaComum {

	private double limite;

	public ContaEspecial(Banco banco, Cliente cliente, Agencia agencia, String numero, double limite) {
		this(banco, cliente, agencia, numero, 0,  limite);
		
	}
	
	public ContaEspecial(Banco banco, Cliente cliente, Agencia agencia, String numero, double saldo, double limite) {
		super(banco, cliente, agencia, numero, saldo);
		this.limite = limite;
		
	}

	public double getLimite() {
		return limite;
	}


	public void sacar(double valor) {
		
		if (valor <= 0) {
			System.out.println("O valor informado para [saque] deve ser maior que zero.");
			return;
		}
		
		System.out.println("Saque solicitado no valor de " + valor);
		
		if (valor <= (super.getSaldo()+this.limite)) {
			super.setSaldo(super.getSaldo()-valor);
			System.out.println("Saque realizado no valor de " + valor);
		} else {
			System.out.println("Saldo Insuficiente!!! O valor de " + valor + " excede o seu saldo atual + limite que eh de : " + (super.getSaldo() + this.limite));
		}
	}
	
	
	public void obterSaldo() {

		System.out.println(super.getCliente().getNome() + " o seu saldo atual eh " + (super.getSaldo() + this.limite));
		
		// if ternario - veremos nas aulas seguintes
		double limiteUtilizado = ((this.getLimite() - (super.getSaldo() + this.limite)) > 0) ? (this.getLimite() - (super.getSaldo() + this.limite)) : 0;
		
		System.out.println("Utilizando " +  limiteUtilizado + " do seu limite permitido!!");
	}
	
}
