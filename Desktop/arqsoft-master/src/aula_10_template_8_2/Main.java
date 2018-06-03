package aula_10_template_8_2;

public class Main {
	public static void main(String[] args) {
		NoticiarioAssina noticiario = new NoticiarioAssina();
		//---------------------------------------------------
		noticiario.notificaNoticia("greve dos caminhoneiros", 1, 5, "greve");
		//---------------------------------------------------
		String[] texto = new String[3];
		texto[0] = "Texto 1";
		texto[1] = "Texto 2";
		texto[2] = "Texto 3";
		int[] dia = new int[3];
		dia[0] = 1;
		dia[1] = 2;
		dia[2] = 3;
		int[] mes = new int[3];
		mes[0] = 1;
		mes[1] = 2;
		mes[2] = 2;
		String[] topicos = new String[3];
		topicos[0] = "Topico 1";
		topicos[1] = "Topico 2";
		topicos[2] = "Topico 3";
		//---------------------------------------------------
		noticiario.agregadores(texto, dia, mes, topicos);
		//---------------------------------------------------
		noticiario.publicador("greve dos caminhoneiros", 1, 5, "greve");

	}
}
