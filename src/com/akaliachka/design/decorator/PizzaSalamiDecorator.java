package com.akaliachka.design.decorator;

public class PizzaSalamiDecorator extends PizzaDecorator {

    public PizzaSalamiDecorator(IPizzaGenerator iPizzaGenerator) {
        super(iPizzaGenerator);
    }

    @Override
    public String createPizzaBase(String base) {
        System.out.println("Salami");
        return iPizzaGenerator.createPizzaBase(base);
    }

    public void eatPizza(){
        System.out.println("MMM.. taste");
    }
}
