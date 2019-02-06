package com.akaliachka.design.decorator;

public class Main {
    public static void main(String[] args) {
        IPizzaGenerator iPizzaGenerator = new PizzaDecorator(new PizzaSalamiDecorator(new PizzaCheeseDecorator(new PizzaComponent("Simple base"))));
        System.out.println(iPizzaGenerator.createPizzaBase());
    }
}
