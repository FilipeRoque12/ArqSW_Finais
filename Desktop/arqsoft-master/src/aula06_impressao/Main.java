package aula06_impressao;

public class Main {
	public static void main(String[] args) {
		
		double i = Math.random();
		if(i > 2.3) {
			Impressao imprimir = new Impressao();
			imprimir.print();
		} else {
			Arquivo arquivo = new Arquivo();
			arquivo.print();
		}
	}
}
