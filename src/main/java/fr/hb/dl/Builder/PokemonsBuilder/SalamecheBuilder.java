package fr.hb.dl.Builder.PokemonsBuilder;

import fr.hb.dl.Builder.interfaces.PokemonBuilder;
import fr.hb.dl.Builder.models.Pokemon;

public class SalamecheBuilder implements PokemonBuilder {

    Pokemon salameche = new Pokemon();
    @Override
    public void buildPokemonName(String nom) {
        salameche.setNom(nom);
    }

    @Override
    public void buildPokemonType(String type) {
        salameche.setType(type);
    }

    @Override
    public void buildPokemonNiveau(int niveau) {
        salameche.setNiveau(niveau);
    }

    @Override
    public Pokemon getResult() {
        return salameche;
    }
}
