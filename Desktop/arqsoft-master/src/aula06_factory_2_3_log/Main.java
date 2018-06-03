package aula06_factory_2_3_log;

public class Main {
	public static void main(String[] args) {
		Factory factory = new Factory();
		// -------------------------
		factory.getImprimir("txt");
		// -------------------------
		factory.getImprimir("terminal");
	}
}
