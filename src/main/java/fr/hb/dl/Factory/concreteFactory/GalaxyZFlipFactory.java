package fr.hb.dl.Factory.concreteFactory;

import fr.hb.dl.Factory.abstractFactory.SmartphoneFactory;
import fr.hb.dl.Factory.concreteProducts.GalaxyZFlip;
import fr.hb.dl.Factory.interfaces.Smartphone;

public class GalaxyZFlipFactory extends SmartphoneFactory {
    @Override
    public Smartphone createSmartphone() {
        return new GalaxyZFlip();
    }
}
