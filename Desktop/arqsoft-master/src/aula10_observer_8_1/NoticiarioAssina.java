package aula10_observer_8_1;

public class NoticiarioAssina extends Noticiario implements ConsomeNoticia {

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("Noticia: " + textoNoticia + " de " + dia + "/" + mes + " referente ao tópico " + topico);
	}
}
