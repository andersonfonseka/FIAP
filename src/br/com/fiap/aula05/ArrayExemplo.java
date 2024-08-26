package br.com.fiap.aula05;

import java.util.Arrays;

public class ArrayExemplo {
	
	public static void main(String[] args) {
		
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i+1;
		}
		
		int soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			soma+= numeros[i];
		}
				
		System.out.println(soma);

		
//		int[] numeros2 = Arrays.copyOf(numeros, 101);
//		
//		numeros2[100] = 2000;
//		
//		for (int i : numeros2) {
//			System.out.println(i);
//		}
		
	}

}
