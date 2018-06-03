package aula08_facade;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFacade {
	public void criarArquivoBinario(String nome, byte[] conteudo) {
		File arquivo = new File(nome);
		try {
			FileOutputStream outputStream = new FileOutputStream(arquivo);
			outputStream.write(conteudo);
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void lerArquivoBinario(String nome) {
		File inFile = new File(nome);
		try {
			FileInputStream inputStream = new FileInputStream(inFile);
			int size = (int) inFile.length();
			byte[] conteudo = new byte[size];
			for(int i = 0; i < conteudo.length; i++) {
				System.out.println(conteudo[i]);
			}
			inputStream.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
