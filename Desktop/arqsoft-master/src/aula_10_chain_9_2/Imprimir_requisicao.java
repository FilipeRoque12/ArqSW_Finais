package aula_10_chain_9_2;

public class Imprimir_requisicao implements Handlers{

	@Override
	public void handleRequest(int[] requisicao) {
		double tempo = System.currentTimeMillis();
		for(int i = 0; i < requisicao.length; i++)
			if(tempo > 200)
				System.out.println(requisicao[i]);
			tempo = System.currentTimeMillis();
	}

}
