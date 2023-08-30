package fr.hb.dl.Decorator.concrete_decorator;

import fr.hb.dl.Decorator.decorator.CarDecorator;
import fr.hb.dl.Decorator.interfaces.Car;
import java.util.ArrayList;

public  class FourWheelDriveDecorator extends CarDecorator {

    public FourWheelDriveDecorator(Car car) {
        super(car);
        car.addOption("4 roues motrices"); // Ajoute automatiquement l'option lors de la création du décorateur
    }
    @Override
    public double getPrice() {
        return super.getPrice()*1.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" avec ses 4 roues motrices ";
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
