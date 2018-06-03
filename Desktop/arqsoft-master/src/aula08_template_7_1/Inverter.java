package aula08_template_7_1;

public class Inverter extends TransformaPalavra{

	@Override
	void transforma(String frase) {
		char[] p = frase.toCharArray();
		for(int i=p.length - 1; i >= 0; i--)
			System.out.print(p[i]);
	}
}
