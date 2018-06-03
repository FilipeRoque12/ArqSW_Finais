package aula_10_template_8_2;

public class NoticiarioAssina extends Noticiario implements ConsomeNoticia{

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("Noticia: " + textoNoticia + " de " + dia + "/" + mes + " referente ao tópico " + topico);
	}

	@Override
	public void agregadores(String textoNoticia[], int dia[], int mes[], String topico[]) {
		int passa = 0;
		for(int e = 1; e < mes.length; e++) {
			if(mes[e-1] == mes[e]) {
				passa ++;
				for(int i = 0; i < textoNoticia.length; i++) {
					System.out.println("Noticia MENSAL: " + textoNoticia[i] + " de " + 0 + "/" + mes[i] + " referente ao tópico " + topico[i]);
				}
			}
		}
		if(passa == 0) {
			for(int i = 0; i < textoNoticia.length; i++)
				System.out.println("Noticia: " + textoNoticia[i] + " de " + dia[i] + "/" + mes[i] + " referente ao tópico " + topico[i]);
		}
	}

	@Override
	public void publicador(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("Noticia: " + textoNoticia + " de " + dia + "/" + mes + " referente ao tópico " + topico);		
	}

}
