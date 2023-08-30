package fr.hb.dl.Factory.concreteProducts;

import fr.hb.dl.Factory.interfaces.Smartphone;

public class IphoneX implements Smartphone {
    @Override
    public void Allumer() {
        System.out.println("IphoneX est allumé");
    }

    @Override
    public void Eteindre() {
        System.out.println("IphoneX est éteind");
    }

    @Override
    public void Appeler() {
        System.out.println("Iphone X appel");
    }

    @Override
    public void EnvoyerSMS() {
        System.out.println("IphoneX envoie un SMS");
    }
}
