package fr.hb.dl.Factory;

import fr.hb.dl.Factory.abstractFactory.SmartphoneFactory;
import fr.hb.dl.Factory.concreteFactory.GalaxyS21Factory;
import fr.hb.dl.Factory.concreteFactory.GalaxyZFlipFactory;
import fr.hb.dl.Factory.concreteFactory.IphoneXFactory;
import fr.hb.dl.Factory.interfaces.Smartphone;

public class Main {
    public static void main(String[] args) {
        SmartphoneFactory galaxyCreator = new GalaxyS21Factory();
        Smartphone galaxySmartphone = galaxyCreator.createSmartphone();
        galaxySmartphone.Allumer();
        galaxySmartphone.EnvoyerSMS();
        galaxySmartphone.Appeler();
        galaxySmartphone.Eteindre();


        SmartphoneFactory iphoneXCreator = new IphoneXFactory();
        Smartphone iphoneXSmartphone = iphoneXCreator.createSmartphone();
        iphoneXSmartphone.Allumer();
        iphoneXSmartphone.Appeler();
        iphoneXSmartphone.EnvoyerSMS();
        iphoneXSmartphone.Eteindre();

        SmartphoneFactory zFlipCreator = new GalaxyZFlipFactory();
        Smartphone galaxyZFlip = zFlipCreator.createSmartphone();
        galaxyZFlip.Allumer();
        galaxyZFlip.EnvoyerSMS();
        galaxyZFlip.Appeler();
        galaxyZFlip.Eteindre();

    }
}
