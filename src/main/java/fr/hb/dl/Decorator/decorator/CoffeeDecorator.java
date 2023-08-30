package fr.hb.dl.Decorator.decorator;

import fr.hb.dl.Decorator.interfaces.Coffee;

public class CoffeeDecorator implements Coffee {
    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
