package com.akaliachka.design.decorator;

public class PizzaCheeseDecorator implements IPizzaGenerator {

    IPizzaGenerator iPizzaGenerator;

    public PizzaCheeseDecorator(IPizzaGenerator iPizzaGenerator) {
        this.iPizzaGenerator = iPizzaGenerator;
    }

    @Override
    public String createPizzaBase() {
        System.out.println("Cheese");
        return iPizzaGenerator.createPizzaBase();
    }
}
