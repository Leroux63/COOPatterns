package fr.hb.dl.Decorator.concrete_component;

import fr.hb.dl.Decorator.interfaces.Car;
import java.util.ArrayList;

public class SimpleCar implements Car {


    private ArrayList<String> optionsCar = new ArrayList<>();
    @Override
    public double getPrice() {
        return 40000;
    }

    @Override
    public String getDescription() {
        return "Ma Tesla de base";
    }


    @Override
    public void addOption(String option) {
        optionsCar.add(option);
    }

    @Override
    public ArrayList<String> getOptionsCar() {
        return optionsCar;
    }
}
