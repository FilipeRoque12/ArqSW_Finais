package aula06_pizza;

public class Calzonaria implements AbstractPizzaria {

	@Override
	public Pizza getFactory(DiaSemana dia) {
		switch(dia) {
		case SEGUNDA: case QUARTA:  case SEXTA:
			return new CalzoneCalabresa();
		case TERCA:  case QUINTA:   case SABADO:
			return new CalzonePresunto();
		default:
			System.out.println("Calzonaria fechada!");
			return null;
		}
	}
}
