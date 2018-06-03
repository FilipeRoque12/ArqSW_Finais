package aula06_factory_2_2_pubconf;

public class Factory {
	public Arquivo getImprimir(String senha) {
		if (senha.equals("desi gnpatt er ns"))
			return new Confidencial();
		else
			return new Publico();
	}
}
