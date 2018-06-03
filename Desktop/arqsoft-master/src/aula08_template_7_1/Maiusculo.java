package aula08_template_7_1;

public class Maiusculo extends TransformaPalavra{

	@Override
	void transforma(String frase) {
		System.out.println(frase.toUpperCase());
	}
	
}
