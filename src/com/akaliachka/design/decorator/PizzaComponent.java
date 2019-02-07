package com.akaliachka.design.decorator;

public class PizzaComponent implements IPizzaGenerator {

	private String pizzaBase;

	public PizzaComponent() {
	}

	@Override
	public String createPizzaBase(String pizzaBase) {
		return pizzaBase;
	}
}
