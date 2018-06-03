package aula08_facade;

public class IOTeste {
	public static void main(String[] args) {
		IOFacade iof = new IOFacade();
		
		byte[] byteArray = { 10,20,30,40,50,60 };
		iof.criarArquivoBinario("teste.bin", byteArray);
		iof.lerArquivoBinario("teste.bin");
	}
}
