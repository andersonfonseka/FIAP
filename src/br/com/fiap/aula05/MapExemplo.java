package br.com.fiap.aula05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExemplo {
	
	public static void main(String[] args) {
		
		
		Map map = new HashMap();
		
		map.put(1, "Joao");
		map.put(2, 123456);
		map.put(3, "Jose");
		map.put(4, "Pedro");
		
		System.out.println(map);
		
		map.put(2, "Karina");
		
		System.out.println(map);
		
		map.remove(3);

		System.out.println(map);

		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
