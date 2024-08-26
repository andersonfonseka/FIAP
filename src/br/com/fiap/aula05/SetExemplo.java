package br.com.fiap.aula05;

import java.util.HashSet;
import java.util.Set;

public class SetExemplo {
	
	
	public static void main(String[] args) {
		
		Set lista = new HashSet();
		
		lista.add("a");
		lista.add("a");
		lista.add("e");
		lista.add("i");
		lista.add("o");
		lista.add("u");
						
		System.out.println(lista);
		
		lista.remove("u");
		
		System.out.println(lista);
		
		System.out.println(lista.toArray()[0]);

		
	}

}
