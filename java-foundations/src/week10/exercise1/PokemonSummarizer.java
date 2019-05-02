package week10.exercise1;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PokemonSummarizer {

    PokemonReader reader = new PokemonReader();
    List<Pokemon> listOfPokemons = reader.getPokemons("week10/exercise1/pokemon.csv");

    protected List<String> getNamesOfLegendary() {
        return listOfPokemons.stream()
                .filter(pokemon -> pokemon.getLegendary() == true)
                .map(pokemon -> pokemon.getName())
                .collect(Collectors.toList());
    }

    protected Set<String> getAllTypes() {
        return listOfPokemons.stream()
                .map(pokemon -> pokemon.getType1())
                .collect(Collectors.toSet());
    }

    protected Map<String, Long> getNumberOfFireType() {
        return listOfPokemons.stream()
                .filter(pokemon -> pokemon.getType1().equalsIgnoreCase("Fire"))
                .collect(Collectors.groupingBy(pokemon -> pokemon.getType1(), Collectors.counting()));
    }

    protected List<String> get5Strongest() {
        return listOfPokemons.stream()
                .sorted((pokemon1, pokemon2) -> pokemon2.getAttack().compareTo(pokemon1.getAttack()))
                .limit(5)
                .map(pokemon -> pokemon.getName())
                .collect(Collectors.toList());
    }

    protected List<String> get3StrongestWaterTypeSortedAlphabetically() {
        return listOfPokemons.stream()
                .filter(pokemon -> pokemon.getType1().equalsIgnoreCase("Water"))
                .sorted((pokemon1, pokemon2) -> pokemon2.getAttack().compareTo(pokemon1.getAttack()))
                .limit(3)
                .map(pokemon -> pokemon.getName())
                .sorted()
                .collect(Collectors.toList());
    }

    protected List<String> getTheOneWithHighestDefence() {
        return listOfPokemons.stream()
                .sorted((pokemon1, pokemon2) -> pokemon2.getDefence().compareTo(pokemon1.getDefence()))
                .limit(1)
                .map(pokemon -> pokemon.getName())
                .collect(Collectors.toList());
    }

    protected List<String> getTwoRockTypeThatAreLegendary() {
        return listOfPokemons.stream()
                .filter(pokemon -> pokemon.getType1().equalsIgnoreCase("Rock"))
                .filter(pokemon -> pokemon.getLegendary())
                .limit(2)
                .map(Pokemon::getName)
                .collect(Collectors.toList());
    }

    protected List<String> get5WithMostHP() {
        return listOfPokemons.stream()
                .sorted((pokemon1, pokemon2) -> pokemon2.getHP().compareTo(pokemon1.getHP()))
                .limit(5)
                .map(Pokemon::getName)
                .collect(Collectors.toList());

    }

    protected long getTotalNumber() {
        return listOfPokemons.stream()
                .count();
    }

}
