package br.com.fiap.aula05;

import java.util.ArrayList;
import java.util.List;

public class ListExemplo {
	
	public static void main(String[] args) {
		
		List lista = new ArrayList();
		
		lista.add("a");
		lista.add("e");
		lista.add("i");
		lista.add("o");
		lista.add("u");
		
		System.out.println(lista);
		
		lista.remove(3);
		
		System.out.println(lista);
		
		System.out.println(lista.get(2));
	}

}
