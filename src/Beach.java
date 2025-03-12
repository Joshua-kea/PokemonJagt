import java.util.ArrayList;

public class Beach extends Forest {
    private ArrayList<Pokemon> pokemons;

    public Beach() {
        pokemons = new ArrayList<>();
    }

    @Override
    public void showAllPokemon() {
        System.out.println("\nPokémon på stranden:");
        for (Pokemon p : pokemons) {
            System.out.println(p);
        }
    }

    @Override
    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    @Override
    public Pokemon searchPokemonByName(String name) {
        for (Pokemon p : pokemons) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Pokemon searchPokemonByType(String type) {
        for (Pokemon p : pokemons) {
            if (p.getType().equalsIgnoreCase(type)) {
                return p;
            }
        }
        return null;
    }
}
