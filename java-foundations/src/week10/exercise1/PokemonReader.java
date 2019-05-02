package week10.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonReader {

    private FileReader reader = new FileReader();

    public List<Pokemon> getPokemons(String filePath) {
        return reader.asStream("week10/exercise1/pokemon.csv")
                .skip(1)
                .map(line -> line.split(";"))
                .map(columns -> new Pokemon(columns[1], columns[2], columns[3],
                        Integer.valueOf(columns[4]), Integer.valueOf(columns[5]),
                                Integer.valueOf(columns[6]), Integer.valueOf(columns[7]),
                                        Integer.valueOf(columns[8]), Integer.valueOf(columns[9]),
                                                Integer.valueOf(columns[10]), Integer.valueOf(columns[11]),
                                                        Boolean.valueOf(columns[12])))
                .collect(Collectors.toList());





    }
}
