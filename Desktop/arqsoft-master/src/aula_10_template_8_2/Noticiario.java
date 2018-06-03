package aula_10_template_8_2;

public abstract class Noticiario {
	public abstract void notificaNoticia(String textoNoticia, int dia,
			int mes, String topico);
	public abstract void agregadores(String textoNoticia[], int dia[], int mes[], String topico[]);
	public abstract void publicador(String textoNoticia, int dia, int mes, String topico);

}
