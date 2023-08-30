package fr.hb.dl.Decorator.decorator;

import fr.hb.dl.Decorator.interfaces.Car;

import java.util.ArrayList;

public abstract class CarDecorator implements Car {

    private final Car decoratedCar;

    public CarDecorator(Car car){
        this.decoratedCar = car;
    }

    public double getPrice(){
        return decoratedCar.getPrice();
    }
    public String getDescription(){
        return decoratedCar.getDescription();
    }


    @Override
    public void addOption(String option) {
        decoratedCar.addOption(option);
    }

    @Override
    public ArrayList<String> getOptionsCar() {
        return decoratedCar.getOptionsCar();
    }
}
