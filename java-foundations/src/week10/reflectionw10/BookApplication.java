package week10.reflectionw10;

public class BookApplication {

    public static void main(String[] args) {

        BookSummarizer summarizer = new BookSummarizer();

        System.out.println("Number of words: " + summarizer.getNumberOfWords());
        System.out.println("Number of distinct words: " + summarizer.getNumberOfDistinctWords());
        System.out.println("The longest word is: "+summarizer.getLongestWord());
        System.out.println("The most appearing five words are: \n"+ summarizer.getFiveMostAppearingWords());
        System.out.println("The most appearing five letters are: \n"+summarizer.getFiveMostAppearingLetters());
        System.out.println("Alice appears: "+summarizer.getNumberOfTimesAliceAppears()+" times");

    }
}
