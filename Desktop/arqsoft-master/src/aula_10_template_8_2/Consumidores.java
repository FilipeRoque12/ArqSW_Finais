package aula_10_template_8_2;

public class Consumidores implements ConsomeNoticia{

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("Noticia: " + textoNoticia + " de " + dia + "/" + mes + " referente ao topico " + topico);
	}

	@Override
	public void agregadores(String textoNoticia[], int dia[], int mes[], String topico[]) {
		for(int i = 0; i < textoNoticia.length; i++)
			System.out.println("Noticia: " + textoNoticia[i] + " de " + dia[i] + "/" + mes[i] + " referente ao topico " + topico[i]);
	}

	@Override
	public void publicador(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("Noticia: " + textoNoticia + " de " + dia + "/" + mes + " referente ao topico " + topico);		
	}
}
