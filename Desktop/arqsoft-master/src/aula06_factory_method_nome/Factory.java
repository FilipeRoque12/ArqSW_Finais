package aula06_factory_method_nome;

public class Factory {
	public Nome getNome(String nome, String sobrenome, String tipo) {
		if (tipo.equals("1"))
			return new NomeSobrenome(nome, sobrenome);
		if (tipo.equals("2"))
			return new SobrenomeNome(sobrenome, nome);
		return null;
	}
}
