package fr.hb.dl.Decorator.concrete_component;

import fr.hb.dl.Decorator.interfaces.Coffee;

public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 2.00;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
