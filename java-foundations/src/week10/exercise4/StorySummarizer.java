package week10.exercise4;

import java.util.List;
import java.util.stream.Collectors;

public class StorySummarizer {

    private List<Book> story = readBook();

    private List<Book> readBook() {
        return new StoryReader().getCharacters("week10/exercise4/got-characters.csv");
    }

    protected Long getNumberOfCharacters() {
        return story.stream()
                .map(e -> e.getName())
                .count();
    }

    protected Long getNumberOfDeadPeople() {
        return story.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .count();
    }

    protected List<String> getPercentageOfDeathsByGender() {
        return story.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .map(e -> e.getGender())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + (e.getValue() * 100) / getNumberOfDeadPeople() + "%")
                .collect(Collectors.toList());
    }

    protected List<String> getBookWithBiggestDeathCount() {
        return story.stream()
                .collect(Collectors.groupingBy(Book::getBookOfDeath, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> !e.getKey().isEmpty())
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "Book: " + e.getKey() + " | Dead: " + e.getValue())
                .collect(Collectors.toList());
    }

    protected List<String> getNamesOfBookWithBiggestDeathCount() {
        return story.stream()
                .filter(e -> e.getBookOfDeath().equals("3"))
                .map(e -> e.getName())
                .collect(Collectors.toList());
    }
    //Which ones are the two allegiances that have the biggest dead count?

    protected List<String> getTwoBiggestAllegiances() {
        return story.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .collect(Collectors.groupingBy(Book::getAllegiances, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + "|" + e.getValue())
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());
    }

    //Which percentage of deaths belong to nobility characters?
    protected List<String> getPercentageOfDeathsOfNobilityCharacters() {
        return story.stream()
                .filter(e -> e.getNobility().equals(1))
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .collect(Collectors.groupingBy(Book::getNobility, Collectors.counting()))
                .entrySet().stream()
                //.sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getValue() * 100 / getNumberOfDeadPeople() + "%")
                .collect(Collectors.toList());
    }

    //In which book die the most amount of characters from the Stark allegiance?
    protected List<String> getBookInWhichMostCharactersFromStarkAllegianceDied() {
        return story.stream()
                .filter(e -> e.getAllegiances().equalsIgnoreCase("stark"))
                .collect(Collectors.groupingBy(Book::getBookOfDeath, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> !e.getKey().isEmpty())
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                //.limit(1)
                .map(e -> "Book: " + e.getKey() + "|" + " Deaths: " + e.getValue())
                .collect(Collectors.toList());
    }

    //In which book die the most amount of characters from the Lannister allegiance?
    protected List<String> getBookInWhichMostCharactersFromLannisterAllegianceDied() {
        return story.stream()
                .filter(e -> e.getAllegiances().equalsIgnoreCase("lannister"))
                .collect(Collectors.groupingBy(Book::getBookOfDeath, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> !e.getKey().isEmpty())
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                //.limit(1)
                .map(e -> "Book: " + e.getKey() + "|" + " Deaths: " + e.getValue())
                .collect(Collectors.toList());
    }
    //How many Starks have died?

    protected long getAmountOfStarkDeaths() {
        return story.stream()
                .filter(e -> e.getAllegiances().equalsIgnoreCase("stark"))
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .count();
    }

    protected long getAmountOfLannisterDeaths() {
        return story.stream()
                .filter(e -> e.getAllegiances().equalsIgnoreCase("lannister"))
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .count();
    }

    protected boolean checkIfSomeoneSurvived() {
        return story.stream()
                .anyMatch(e -> e.getBookOfDeath().isEmpty());
    }

    protected boolean checkIfSomeoneDiedInTheChapterHeOrSheGotIntroduced() {
        return story.stream()
                .filter(e -> !e.getBookIntroChapter().isEmpty())
                .anyMatch(e -> !e.getBookOfDeath().isEmpty());
    }


}



