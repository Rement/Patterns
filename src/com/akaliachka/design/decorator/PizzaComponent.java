package com.akaliachka.design.decorator;

public class PizzaComponent implements IPizzaGenerator {

	private String pizzaBase;

	public PizzaComponent(String pizzaBase) {
		this.pizzaBase = pizzaBase;
	}

	@Override
	public String createPizzaBase() {
		return pizzaBase;
	}
}
