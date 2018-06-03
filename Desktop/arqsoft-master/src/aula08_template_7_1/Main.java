package aula08_template_7_1;

public class Main {
	public static void main(String[] args) {
		Duplicar duplicar = new Duplicar();
		duplicar.transforma("Essa é a frase");
		// -----------------------------
		Maiusculo maiusculo = new Maiusculo();
		maiusculo.transforma("Essa é a frase");
		// -----------------------------
		Minusculo minusculo = new Minusculo();
		minusculo.transforma("Essa é a frase");
		// -----------------------------
		Inverter inverter = new Inverter();
		inverter.transforma("Essa é a frase");
		// -----------------------------
	}
}
