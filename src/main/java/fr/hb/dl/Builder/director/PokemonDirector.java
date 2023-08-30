package fr.hb.dl.Builder.director;

import fr.hb.dl.Builder.interfaces.PokemonBuilder;

public class PokemonDirector {

    public void constructPikachu(PokemonBuilder builder){
        builder.buildPokemonName("Pikachu");
        builder.buildPokemonType("Electric");
        builder.buildPokemonNiveau(20);
    }

    public void constructCarapuce(PokemonBuilder builder){
        builder.buildPokemonName("Carapuce");
        builder.buildPokemonType("Plante");
        builder.buildPokemonNiveau(25);
    }
    public void constructSalameche(PokemonBuilder builder){
        builder.buildPokemonName("Salameche");
        builder.buildPokemonType("Feu");
        builder.buildPokemonNiveau(40);
    }
}
