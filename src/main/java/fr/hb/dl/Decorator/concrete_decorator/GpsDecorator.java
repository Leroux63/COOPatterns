package fr.hb.dl.Decorator.concrete_decorator;

import fr.hb.dl.Decorator.decorator.CarDecorator;
import fr.hb.dl.Decorator.interfaces.Car;

import java.util.ArrayList;

public class GpsDecorator extends CarDecorator {
    public GpsDecorator(Car car) {
        super(car);
        car.addOption("GPS");
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" avec son super GPS ";
    }


    @Override
    public double getPrice() {
        return super.getPrice()*1.1;
    }

    @Override
    public ArrayList<String> getOptionsCar() {
        return super.getOptionsCar();
    }

    @Override
    public void addOption(String option) {
        super.addOption(option);
    }
}
