package week8.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {

    protected List<String> findRightWords(String string, Predicate<String> condition) {
        List<String> result = new ArrayList<>();
        for (String word : string.split(" ")) {
            if (condition.test(word)) {
                result.add(word);
            }
        }
        return result;
    }
}
