public class PokemonTest extends Pokedex{
    public static void main(String[] args){
        Pokedex pokedex = new Pokedex();
        Pokemon charmander = pokedex.createPokemon("Charmander","Fire",99);
        Pokemon pikachu = pokedex.createPokemon("Pikachu","Electric",49);

        pokedex.attackPokemon(charmander);
        pokedex.pokemonInfo(charmander);
        pokedex.pokemonInfo(pikachu);

    }
}
