package br.com.fiap.aula06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeituraBufferedReader {
	
	public static void main(String[] args)  {
		
		File arquivo = new File("Teste.txt");
		
		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
			
			String linha = "";
			
			while((linha = bufferedReader.readLine()) != null) {
				System.out.println(linha);
			}
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		
		
	}

}
