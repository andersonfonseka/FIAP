package br.com.fiap.banco;

public class ContaCorrente extends Conta {
	
	private String agencia;
	
	private double limite;

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void sacar(double valor) {
		System.out.println("Saque solicitado no valor de " + valor);
		
		if (valor <= (super.getSaldo()+this.limite)) {
			super.setSaldo(super.getSaldo()-valor);
			System.out.println("Saque realizado no valor de " + valor);
		} else {
			System.out.println("Saldo Insuficiente!!! O valor de " + valor + " excede o seu saldo atual + limite que eh de : " + (super.getSaldo() + this.limite));
		}
	}
	
	@Override
	public void obterSaldo() {
		System.out.println(super.getCliente().getNome() + " o seu saldo atual eh " + (super.getSaldo() + this.limite));
		
		// if ternario - veremos nas aulas
		double limiteUtilizado = ((this.getLimite() - (super.getSaldo() + this.limite)) > 0) ? (this.getLimite() - (super.getSaldo() + this.limite)) : 0;
		
		System.out.println("Utilizando " +  limiteUtilizado + " do seu limite permitido!!");
	}
	
}
