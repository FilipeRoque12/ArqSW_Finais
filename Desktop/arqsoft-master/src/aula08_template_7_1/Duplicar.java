package aula08_template_7_1;

public class Duplicar extends TransformaPalavra{

	@Override
	void transforma(String frase) {
		String novaFrase = "";
		for(int i = 0; i < frase.length(); i++)
			novaFrase += frase.substring(i, i+1) + frase.substring(i, i+1);
		System.out.println(novaFrase);
	}

}
