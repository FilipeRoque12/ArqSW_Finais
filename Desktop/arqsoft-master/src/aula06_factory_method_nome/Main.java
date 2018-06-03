package aula06_factory_method_nome;

public class Main {
	public static void main(String[] args) {
		Factory factory = new Factory();
		String nome = "";
		String sobrenome = "";
		String tipo = "";	
		// -------------------------
		nome = "Carlos";
		sobrenome = "M";
		tipo = "1";
		factory.getNome(nome, sobrenome, tipo);
		// -------------------------
		nome = "Jose";
		sobrenome = "M";
		tipo = "2";
		factory.getNome(nome, sobrenome, tipo);
	}
}
