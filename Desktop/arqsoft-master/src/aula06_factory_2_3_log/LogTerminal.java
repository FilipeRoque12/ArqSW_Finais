package aula06_factory_2_3_log;

public class LogTerminal extends Arquivo{
	public LogTerminal() {
		for(int i = 1; i <= 10; i++)
			System.out.println("' " + i + " '");
	}
}
