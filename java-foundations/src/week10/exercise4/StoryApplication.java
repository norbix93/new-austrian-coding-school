package week10.exercise4;

public class StoryApplication {

    public static void main(String[] args) {
        StorySummarizer summarizer = new StorySummarizer();
        System.out.println("Total amount of characters: " + summarizer.getNumberOfCharacters());
        System.out.println("Total amount of deaths: " + summarizer.getNumberOfDeadPeople());
        System.out.println("Total amount of deaths by gender: \n" + "- Men died:" +
                summarizer.getPercentageOfDeathsByGender().get(0) + "\n" + "- Women died:"
                + summarizer.getPercentageOfDeathsByGender().get(1));
        System.out.println("Number of deaths divided by books: ");
        summarizer.getBookWithBiggestDeathCount();
        System.out.println("Names of death characters: ");
        System.out.println(summarizer.getNamesOfBookWithBiggestDeathCount());
        System.out.println("The two allegiances with biggest dead count are: \n"
                + summarizer.getTwoBiggestAllegiances());
        System.out.println("Percentage of deaths belong to nobility characters: \n"
                + summarizer.getPercentageOfDeathsOfNobilityCharacters());
        System.out.println("Book with highest amount of Stark deaths: " +
                summarizer.getBookInWhichMostCharactersFromStarkAllegianceDied());
        System.out.println("Book with highest amount of Lannister deaths: "
                + summarizer.getBookInWhichMostCharactersFromLannisterAllegianceDied());
        System.out.println("Amount of Stark deaths: " + summarizer.getAmountOfStarkDeaths());
        System.out.println("Amount of Lannister deaths: " + summarizer.getAmountOfLannisterDeaths());
        System.out.println("Is there people who survived: " + summarizer.checkIfSomeoneSurvived());
        System.out.println("Is there people who died in the introduction: " + summarizer.checkIfSomeoneDiedInTheChapterHeOrSheGotIntroduced());
        //summarizer.getAmountOfStarkDeaths().ifPresent(e-> System.out.println(e));

    }
}
