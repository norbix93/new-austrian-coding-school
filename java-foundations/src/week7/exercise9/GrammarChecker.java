package week7.exercise9;

import java.util.ArrayList;
import java.util.List;

public class GrammarChecker {


    protected List<String> checkGrammar(List<String> dictionary, List<String> book) {
        List<String> misspelledWords = new ArrayList<>();

        for (String word : book) {
            if (!dictionary.contains(word)) {
                misspelledWords.add(word);
            }
        }

        return misspelledWords;
    }

    public Integer getCounter(List<String> misspelledWords) {
        Integer counter = misspelledWords.size();
        return counter;
    }

    public void display() {
        Read read = new Read();
        Dictionary dictionary = new Dictionary();
        String filePath = "exercise9/dr.jekyll-and-mr.hyde.txt";
        System.out.println("Number of words checked: " + read.getNumberOfWords(read.readLines(filePath)));
        System.out.println("Number of misspelled words: " + getCounter(checkGrammar(dictionary.getDictionary(),
                read.readLines(filePath))));
        System.out.println("Misspelled words: " + checkGrammar(dictionary.getDictionary(),
                read.readLines(filePath)));
    }

}

