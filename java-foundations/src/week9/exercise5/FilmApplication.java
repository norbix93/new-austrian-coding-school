package week9.exercise5;

import week9.exercise2.FileReader;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilmApplication {

    public static void main(String[] args) {
        FileReader reader = new FileReader();
        Stream<String> listOfFilms = reader.asStream("week9/exercise5/films.csv");
        List<Film> splitText = listOfFilms
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Film(e[8], Double.valueOf(e[9]),
                        Integer.valueOf(e[10]), Integer.valueOf(e[6]), Integer.valueOf(e[0]), e[5]))
                .collect(Collectors.toList());

        System.out.println("Top 3 with highest rating, sorted by rating: ");
        List<String> sortedByRanking = splitText.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .map(e -> e.getTitle())
                .collect(Collectors.toList());
        System.out.println(sortedByRanking);

        System.out.println("Top 3 with highest rating longer than 3 hours, sorted by rating:");
        List<String> sortedByRuntime = splitText.stream()
                .filter(e -> e.getRuntime() > 180)
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .map(e -> e.getTitle())
                .collect(Collectors.toList());
        System.out.println(sortedByRuntime);

        System.out.println("Top 4 most expensive, sorted by budget: ");
        List<String> sortedByBudget = splitText.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .map(e -> e.getTitle())
                .collect(Collectors.toList());
        System.out.println(sortedByBudget);

        System.out.println("Top 4 most expensive shorter than 90 minutes, sorted by budget: ");
        List<String> sortedByRuntimeAndBudged = splitText.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .filter(n -> n.getRuntime() < 90)
                .limit(4)
                .map(e -> e.getTitle())
                .collect(Collectors.toList());
        System.out.println(sortedByRuntimeAndBudged);

        System.out.println("Top 4 most rated over 7 and budget between 50.000 and 500.000, sorted by budget:");
        List<String> sortedByRatingAndBudged = splitText.stream()
                .filter(f -> f.getScore() > 7.0)
                .filter(f -> f.getBudget() > 50000)
                .filter(f -> f.getBudget() < 500000)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .map(e -> e.getTitle())
                .collect(Collectors.toList());
        System.out.println(sortedByRatingAndBudged);

    }
}
