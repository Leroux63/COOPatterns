package fr.hb.dl.Factory.concreteFactory;

import fr.hb.dl.Factory.abstractFactory.SmartphoneFactory;
import fr.hb.dl.Factory.concreteProducts.IphoneX;
import fr.hb.dl.Factory.interfaces.Smartphone;

public class IphoneXFactory extends SmartphoneFactory {
    @Override
    public Smartphone createSmartphone() {
        return new IphoneX();
    }
}
