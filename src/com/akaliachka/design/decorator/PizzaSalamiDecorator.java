package com.akaliachka.design.decorator;

public class PizzaSalamiDecorator implements IPizzaGenerator {
    private IPizzaGenerator iPizzaGenerator;

    public PizzaSalamiDecorator(IPizzaGenerator iPizzaGenerator) {
        this.iPizzaGenerator = iPizzaGenerator;
    }

    @Override
    public String createPizzaBase() {
        System.out.println("Salami");
        return iPizzaGenerator.createPizzaBase();
    }
}
