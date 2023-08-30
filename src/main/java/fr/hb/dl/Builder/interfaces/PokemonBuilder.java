package fr.hb.dl.Builder.interfaces;

import fr.hb.dl.Builder.models.Pokemon;

public interface PokemonBuilder {

    void buildPokemonName(String nom);

    void buildPokemonType(String type);

    void buildPokemonNiveau(int niveau);

    Pokemon getResult();
}
