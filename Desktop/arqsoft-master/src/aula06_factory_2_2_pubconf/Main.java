package aula06_factory_2_2_pubconf;

public class Main {
	public static void main(String[] args) {
		Factory factory 	= new Factory();
		// -------------------------
		factory.getImprimir("");
		// -------------------------
		String senha	= "desi gnpatt er ns";

		factory.getImprimir(senha);
	}
}
