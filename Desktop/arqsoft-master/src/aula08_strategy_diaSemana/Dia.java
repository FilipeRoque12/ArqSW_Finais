package aula08_strategy_diaSemana;

public class Dia implements DiaSemana {

	@Override
	public String diaSemana(String diaSemana) {
		if(diaSemana.equals("segunda"))
			return "Hoje é segunda feira";
		if(diaSemana.equals("terca"))
			return "Hoje é terca feira";
		if(diaSemana.equals("quarta"))
			return "Hoje é quarta feira";
		if(diaSemana.equals("quinta"))
			return "Hoje é quinta feira";
		if(diaSemana.equals("sexta"))
			return "Hoje é sexta feira";
		if(diaSemana.equals("sabado"))
			return "Hoje é sabado feira";
		if(diaSemana.equals("domingo"))
			return "Hoje é domingo feira";
		return "Dia da semana incorreto";
	}

}
