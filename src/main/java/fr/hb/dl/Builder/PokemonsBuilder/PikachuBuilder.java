package fr.hb.dl.Builder.PokemonsBuilder;

import fr.hb.dl.Builder.interfaces.PokemonBuilder;
import fr.hb.dl.Builder.models.Pokemon;

public class PikachuBuilder implements PokemonBuilder {

    private Pokemon pikachu = new Pokemon();
    @Override
    public void buildPokemonName(String nom) {
        pikachu.setNom(nom);
    }

    @Override
    public void buildPokemonType(String type) {
        pikachu.setType(type);
    }

    @Override
    public void buildPokemonNiveau(int niveau) {
        pikachu.setNiveau(niveau);
    }

    @Override
    public Pokemon getResult() {
        return pikachu;
    }
}
