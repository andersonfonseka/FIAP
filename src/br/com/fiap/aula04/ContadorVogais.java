package br.com.fiap.aula04;

import java.util.HashMap;
import java.util.Map;

public class ContadorVogais {

	public static void main(String[] args) {

		Map<String, Integer> mapVogais = new HashMap();

		String texto = "maria andava na rua e levou um tropeco";

		for (int i = 0; i < texto.length(); i++) {

			String key = String.valueOf(texto.charAt(i));

			if (key.equalsIgnoreCase("a") || key.equalsIgnoreCase("e") || key.equalsIgnoreCase("i")
					|| key.equalsIgnoreCase("o") || key.equalsIgnoreCase("u")) {

				if (mapVogais.containsKey(key)) {
					mapVogais.put(key, mapVogais.get(key) + 1);
				} else {
					mapVogais.put(key, 1);
				}
			}
		}

		System.out.println(mapVogais);
	}

}
