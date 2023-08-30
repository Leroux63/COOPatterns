package fr.hb.dl.Factory.concreteFactory;

import fr.hb.dl.Factory.abstractFactory.SmartphoneFactory;
import fr.hb.dl.Factory.concreteProducts.GalaxyS21;
import fr.hb.dl.Factory.interfaces.Smartphone;

public class GalaxyS21Factory extends SmartphoneFactory {
    @Override
    public Smartphone createSmartphone() {
        return new GalaxyS21();
    }
}
