package aula_10_template_8_2;

public interface ConsomeNoticia {
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico);
	public void agregadores(String textoNoticia[], int dia[], int mes[], String topico[]);
	public void publicador(String textoNoticia, int dia, int mes, String topico);
}
