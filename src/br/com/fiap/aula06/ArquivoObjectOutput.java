package br.com.fiap.aula06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArquivoObjectOutput {

	public static void main(String[] args) {
		
		File arquivo = new File("Teste.txt");
		
		try {

			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo));

			List<Pessoa> pessoas = new ArrayList();
			
			pessoas.add(new Pessoa("Anderson", 100, 2000));
			pessoas.add(new Pessoa("Maria", 10, 5000));
			pessoas.add(new Pessoa("Joana", 50, 6000));
			
			outputStream.writeObject(pessoas);
			outputStream.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		try {
			
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivo));
			
			List<Pessoa> pessoas = (List<Pessoa>) inputStream.readObject();
			System.out.println(pessoas);
			
			for (Pessoa pessoa : pessoas) {
				System.out.println(pessoa);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
	}
	
}
