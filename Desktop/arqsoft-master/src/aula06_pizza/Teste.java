package aula06_pizza;

public class Teste {
	public static void main(String[] args) {
		AbstractPizzaria fabrica = new Pizzaria();
		Pizza pizza = fabrica.getFactory(DiaSemana.QUARTA);
		System.out.println(pizza.fazerPizza());
		
		pizza = fabrica.getFactory(DiaSemana.SABADO);
		System.out.println(pizza.fazerPizza());
		
		fabrica = new Calzonaria();
		pizza = fabrica.getFactory(DiaSemana.SEXTA);
		System.out.println(pizza.fazerPizza());
		
		pizza = fabrica.getFactory(DiaSemana.SEGUNDA);
		System.out.println(pizza.fazerPizza());
	}
}
