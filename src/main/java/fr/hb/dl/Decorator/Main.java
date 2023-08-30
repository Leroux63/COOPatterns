package fr.hb.dl.Decorator;

import fr.hb.dl.Decorator.concrete_component.SimpleCar;
import fr.hb.dl.Decorator.concrete_decorator.FourWheelDriveDecorator;
import fr.hb.dl.Decorator.concrete_decorator.GpsDecorator;
import fr.hb.dl.Decorator.interfaces.Car;

public class Main {
    public static void main(String[] args) {
        Car teslaDeBase = new SimpleCar();
        System.out.println(teslaDeBase.getDescription());

        Car tesla4 = new FourWheelDriveDecorator(new SimpleCar());
        System.out.println(tesla4.getOptionsCar());

        System.out.print(tesla4.getDescription());
        System.out.print(tesla4.getPrice()+"€");

        Car teslaGps = new GpsDecorator(new SimpleCar());
        System.out.println(teslaGps.getDescription());
        System.out.print(teslaGps.getPrice()+"€");

        Car teslaFullOptions = new GpsDecorator(new FourWheelDriveDecorator(new SimpleCar()));
        System.out.println(teslaFullOptions.getDescription());
        System.out.println(teslaFullOptions.getPrice()+"€");
        System.out.println(teslaFullOptions.getOptionsCar());
    }
}
