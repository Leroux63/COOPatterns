package fr.hb.dl.Factory.concreteProducts;

import fr.hb.dl.Factory.interfaces.Smartphone;

public class GalaxyS21 implements Smartphone {
    @Override
    public void Allumer() {
        System.out.println("Galaxy S21 allumé");
    }

    @Override
    public void Eteindre() {
        System.out.println("Galaxy S21 éteind");
    }

    @Override
    public void Appeler() {
        System.out.println("GalaxyS21 en appel");
    }

    @Override
    public void EnvoyerSMS() {
        System.out.println("Galaxy S21 envoie SMS");
    }
}
