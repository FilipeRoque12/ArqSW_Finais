package aula06_factory_2_3_log;

public class Factory {
	public Arquivo getImprimir(String arquivo) {
		if (arquivo.equals("txt"))
			return new LogTXT();
		if (arquivo.equals("terminal"))
			return new LogTerminal();
		return null;
	}
}
