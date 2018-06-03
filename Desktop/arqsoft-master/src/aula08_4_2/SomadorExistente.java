package aula08_4_2;

public class SomadorExistente {
	public int somaLista(int[] vetor) {
		int resultado = 0;
		for(int i: vetor) {
			resultado += i;
		}
		return resultado;
	}
}
