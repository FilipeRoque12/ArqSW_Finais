package aula08_4_1_adapter;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter extends SomadorExistente implements SomadorEsperado{
	
	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<>();
		for(int i: vetor) {
			lista.add(i);
		}
		return somaLista(vetor);
	}
}
