package aula08_strategy_ordenacao;

public class Tempo {
	
	public Tempo(int[] vetor, int posicao, int r) {
		tempoExecQuickSort(vetor, posicao, r);
		tempoExecSelecion(vetor);
		tempoExecBolha(vetor);
		tempoExecInsercao(vetor);
	}
	Ordem ordem = new Ordem();
	public void tempoExecQuickSort(int vetor[], int posicao, int r) {
		long tempoInicio = System.currentTimeMillis();
		long tempo = System.currentTimeMillis()-tempoInicio;
		System.out.println("QuickSort: " + tempo);
	}
	
	public void tempoExecSelecion(int vetor[]) {
		long tempoInicio = System.currentTimeMillis();
		long tempo = System.currentTimeMillis()-tempoInicio;
		System.out.println("Selecion: " + tempo);
	}
	
	public void tempoExecBolha(int vetor[]) {
		long tempoInicio = System.currentTimeMillis();
		ordem.bolha(vetor);
		long tempo = System.currentTimeMillis()-tempoInicio;
		System.out.println("Bolha: " + tempo);
	}
	
	public void tempoExecInsercao(int vetor[]) {
		long tempoInicio = System.currentTimeMillis();
		long tempo = System.currentTimeMillis() - tempoInicio;
		System.out.println("Insercao: " + tempo);
	}	
}
