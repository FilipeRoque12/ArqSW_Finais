package aula08_4_1_adapter;

public class SomadorExistente {
	public int somaLista(int[] vetor) {
		int resultado = 0;
		for(int i: vetor) {
			resultado += i;
		}
		return resultado;
	}
}
