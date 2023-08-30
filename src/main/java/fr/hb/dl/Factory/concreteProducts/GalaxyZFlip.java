package fr.hb.dl.Factory.concreteProducts;

import fr.hb.dl.Factory.interfaces.Smartphone;

public class GalaxyZFlip implements Smartphone {
    public void Allumer() {
        System.out.println("GalaxyZ Flip allumé");
    }

    @Override
    public void Eteindre() {
        System.out.println("GalaxyZ Flip  éteind");
    }

    @Override
    public void Appeler() {
        System.out.println("GalaxyZ Flip  en appel");
    }

    @Override
    public void EnvoyerSMS() {
        System.out.println("GalaxyZ Flip  envoie SMS");
    }
}
