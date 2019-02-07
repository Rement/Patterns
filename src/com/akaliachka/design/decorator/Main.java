package com.akaliachka.design.decorator;

public class Main {
    public static void main(String[] args) {
        PizzaSalamiDecorator iPizzaGenerator = new PizzaSalamiDecorator(new PizzaCheeseDecorator(new PizzaComponent()));
        System.out.println(iPizzaGenerator.createPizzaBase("Simple base"));
        iPizzaGenerator.eatPizza();
    }
}
