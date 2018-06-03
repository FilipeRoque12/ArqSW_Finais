package aula06_factory_2_2_pubconf;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Confidencial extends Arquivo{
	public Confidencial() {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("confidencial.txt"));
			while(br.ready()){ 
				String linha = br.readLine(); 
				System.out.println(linha); 
			} 
			br.close(); 
		} catch (IOException e) {
		} 
	}
}
