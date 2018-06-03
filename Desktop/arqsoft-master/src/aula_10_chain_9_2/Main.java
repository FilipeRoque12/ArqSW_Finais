package aula_10_chain_9_2;

public class Main {

	public static void main(String[] args) {
		int[] resultado = new int[3];
		resultado[0] = 1;
		resultado[1] = 1;
		resultado[2] = 1;
		Handlers handler = new Imprimir_requisicao();
		handler.handleRequest(resultado);

	}
}
