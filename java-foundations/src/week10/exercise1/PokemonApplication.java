package week10.exercise1;


public class PokemonApplication {

    public static void main(String[] args) {
        PokemonSummarizer pokemons = new PokemonSummarizer();
        System.out.println("1. The legendary pokemons are: " + pokemons.getNamesOfLegendary());
        System.out.println("2. The types of pokemons are: " + pokemons.getAllTypes());
        System.out.println("3. The amount of fire type pokemons is: " + pokemons.getNumberOfFireType());
        System.out.println("4. The 5 strongest pokemons are: " + pokemons.get5Strongest());
        System.out.println("5. The 3 strongest water pokemons sorted alphabetically are: " +
                pokemons.get3StrongestWaterTypeSortedAlphabetically());
        System.out.println("6. The pokemon with highest defence points is: " + pokemons.getTheOneWithHighestDefence());
        System.out.println("7. Two legendary rock pokemons are: " + pokemons.getTwoRockTypeThatAreLegendary());
        System.out.println("8. The 5 pokemons with most HP are: " + pokemons.get5WithMostHP());
        System.out.println("9. The total number of pokemons is: " + pokemons.getTotalNumber());

    }


}
