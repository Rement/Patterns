package com.akaliachka.design.decorator;

public class PizzaCheeseDecorator extends PizzaDecorator {


    public PizzaCheeseDecorator(IPizzaGenerator iPizzaGenerator) {
        super(iPizzaGenerator);
    }

    @Override
    public String createPizzaBase(String base) {
        System.out.println("Cheese");
        return iPizzaGenerator.createPizzaBase(base);
    }
}
