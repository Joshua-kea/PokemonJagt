public class Main {
    public static void main(String[] args) {
        // Opret skoven og tilføj Pokémoner
        Forest forest = new Forest();
        forest.addPokemon(new Pokemon("Pikachu", "Electric", 10));
        forest.addPokemon(new Pokemon("Charmander", "Fire", 12));
        forest.addPokemon(new Pokemon("Squirtle", "Water", 8));
        forest.addPokemon(new Pokemon("Bulbasaur", "Grass", 7));

        //Vis alle Pokémoner i skoven
        forest.showAllPokemon();
        System.out.println();

        // Opret en træner
        Trainer ash = new Trainer("Ash");

        // Træneren søger efter en Pokémon baseret på navn
        ash.searchForPokemon(forest, "name", "Bulbasaur");

        // Træneren søger efter en Pokémon baseret på type
        ash.searchForPokemon(forest, "type", "Grass");

        // Prøver at søge efter en ikke-eksisterende Pokémon
        ash.searchForPokemon(forest, "name", "Charizard");

        //Opret stranden og tilføj Pokémoner
        Beach beach = new Beach();
        beach.addPokemon(new Pokemon("Charizard", "Fire", 6));
        beach.addPokemon(new Pokemon("Wartortle", "Water", 8));
        beach.addPokemon(new Pokemon("Butterfree", "Bug", 12));
        beach.addPokemon(new Pokemon("Jigglypuff", "Fairy", 10));

        // Vis alle Pokémoner på stranden
        beach.showAllPokemon();
        System.out.println();

        // Træneren søger efter en Pokémon baseret på navn
        ash.searchForPokemon(beach, "name", "Charizard");
    }
}
