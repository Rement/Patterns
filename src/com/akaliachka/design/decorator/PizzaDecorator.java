package com.akaliachka.design.decorator;

public class PizzaDecorator implements IPizzaGenerator {

    private IPizzaGenerator iPizzaGenerator;

    public PizzaDecorator(IPizzaGenerator iPizzaGenerator) {
        this.iPizzaGenerator = iPizzaGenerator;
    }

    @Override
    public String createPizzaBase() {
        return iPizzaGenerator.createPizzaBase();
    }
}
