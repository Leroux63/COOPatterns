package fr.hb.dl.Builder;

import fr.hb.dl.Builder.PokemonsBuilder.CarapuceBuilder;
import fr.hb.dl.Builder.PokemonsBuilder.PikachuBuilder;
import fr.hb.dl.Builder.PokemonsBuilder.SalamecheBuilder;
import fr.hb.dl.Builder.director.PokemonDirector;
import fr.hb.dl.Builder.models.Pokemon;

public class Main {
    public static void main(String[] args) {

        CarapuceBuilder carapuceBuilder = new CarapuceBuilder();
        SalamecheBuilder salamecheBuilder = new SalamecheBuilder();
        PikachuBuilder pikachuBuilder = new PikachuBuilder();

        PokemonDirector director = new PokemonDirector();
        director.constructSalameche(salamecheBuilder);
        Pokemon salameche = salamecheBuilder.getResult();
        System.out.println(salameche);

        director.constructCarapuce(carapuceBuilder);
        Pokemon carapuce = carapuceBuilder.getResult();
        System.out.println(carapuce);

        director.constructPikachu(pikachuBuilder);
        Pokemon pikachu = pikachuBuilder.getResult();
        System.out.println(pikachu);
    }
}
