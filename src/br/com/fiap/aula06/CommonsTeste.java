package br.com.fiap.aula06;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class CommonsTeste {

	public static void main(String[] args) {
		
		File arquivo = new File("commons.txt");
		
//		try {
//			FileUtils.writeStringToFile(arquivo, "ESTA E UMA AULA DE DDD COM JAVA FALANDO SOBRE ARQUIVOS", Charset.defaultCharset());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		
		try {
		
			String conteudo = FileUtils.readFileToString(arquivo, Charset.defaultCharset());
			System.out.println(conteudo);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
