package aula07;

public class TesteIncremental {
	public static void main(String[] args) {
		IncrementalSingleton singleton = IncrementalSingleton.getInstance();

		for (int i = 0; i < 10; i++) {
			System.out.println(singleton.toString());
		}
	}
}