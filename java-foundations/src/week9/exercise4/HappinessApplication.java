package week9.exercise4;

import java.util.Comparator;
import java.util.stream.Stream;

public class HappinessApplication {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        Stream<String> listOfCountries = fileReader.asStream("week9/exercise4/world-happiness-2017.csv");

        listOfCountries
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new HappinessRecord(String.valueOf(e[0]), Integer.valueOf(e[1]), Double.valueOf(e[2])))
                .sorted(Comparator.comparing(e -> e.getRank()))
                .limit(5)
                .forEach(e -> System.out.println(e));
    }
}
