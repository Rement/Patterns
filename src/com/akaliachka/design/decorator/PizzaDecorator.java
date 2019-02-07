package com.akaliachka.design.decorator;

public abstract class PizzaDecorator implements IPizzaGenerator {

    IPizzaGenerator iPizzaGenerator;

    public PizzaDecorator(IPizzaGenerator iPizzaGenerator) {
        this.iPizzaGenerator = iPizzaGenerator;
    }

}
