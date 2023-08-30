package fr.hb.dl.Builder.PokemonsBuilder;

import fr.hb.dl.Builder.interfaces.PokemonBuilder;
import fr.hb.dl.Builder.models.Pokemon;

public class CarapuceBuilder implements PokemonBuilder {

    private Pokemon carapuce = new Pokemon();
    @Override
    public void buildPokemonName(String nom) {
        carapuce.setNom(nom);
    }

    @Override
    public void buildPokemonType(String type) {
        carapuce.setType(type);
    }

    @Override
    public void buildPokemonNiveau(int niveau) {
        carapuce.setNiveau(niveau);
    }

    @Override
    public Pokemon getResult() {
        return carapuce;
    }
}
