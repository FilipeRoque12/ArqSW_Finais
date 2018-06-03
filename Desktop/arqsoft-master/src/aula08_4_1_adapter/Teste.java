package aula08_4_1_adapter;

public class Teste {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
