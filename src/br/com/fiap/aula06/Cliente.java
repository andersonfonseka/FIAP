package br.com.fiap.aula06;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cliente {

	public static void main(String[] args) {
		
		
		File arquivo = new File("Teste.txt");
//		
//		try {
//			
//			if (arquivo.createNewFile()) {
//				System.out.println("Arquivo criado!!");
//			} else {
//				System.out.println("Arquivo ja existe");
//			}
//			
//		} catch (IOException ioex) {
//			System.out.println(ioex.getMessage());
//		}
//		
//		System.out.println("Tamanho do arquivo " + arquivo.length() + " bytes");
//		System.out.println("Posso escrever..." + arquivo.canWrite());
//		System.out.println("Caminho absoluto " + arquivo.getAbsolutePath());
		
		FileReader fileReader = null;
		
		try {

			fileReader = new FileReader(arquivo);

			while(fileReader.read() != -1) {
				
				char[] c = new char[256];
				
				fileReader.read(c);
				System.out.print(c);
				
			}
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
	
}
