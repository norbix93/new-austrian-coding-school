package week8.exercise3;

import java.util.function.Predicate;

public class KeywordFinderApplication {

    public static void main(String[] args) {
        Predicate<String> getElegantWord = word -> word.contains("ele");
        Predicate<String> getPlayfulWord = word -> word.contains("ful");
        KeywordFinder keywordFinder = new KeywordFinder();
        String sentence1 = "The elephant is lifted eleven floors easily with the help of an electricity elevator";
        System.out.println(keywordFinder.findRightWords(sentence1, getElegantWord));
        String sentence2 = "The rightful heir of the powerful king had an awful accident playing with a colorful bear";
        System.out.println(keywordFinder.findRightWords(sentence2, getPlayfulWord));
    }
}
