package aula08_strategy_ordenacao;

public interface Ordenar {
	int[] bolha(int [] vetor);
	int[] insercao(int [] vetor);
	int[] selecao(int [] vetor);
	int[] quicksort(int [] vetor, int posicao, int r);
}
