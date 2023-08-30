package fr.hb.dl.Decorator.interfaces;

import java.util.ArrayList;

public interface Car {

    double getPrice();
    String getDescription();

    ArrayList<String> getOptionsCar();
    void addOption(String option);

}
