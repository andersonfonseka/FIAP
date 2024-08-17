package br.com.fiap.aula01;

public class Circulo {
	
	private static final double PI = 3.14159;

	public double area(double r2) {
		return PI * r2 * r2;
	}
	
	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		System.out.println("Calculo da area do circulo " + circulo.area(5.0));
		
	}
}
