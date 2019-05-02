package week7.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSplitter {

    public List<Integer> splitNumbers(Integer number) {
        List<Integer> splitNumbers = new ArrayList<>();
        while (number > 9) {
            Integer unit = number % 10;
            splitNumbers.add(unit);
            number = (number / 10);
        }
        splitNumbers.add(number);
        Collections.reverse(splitNumbers);
        return splitNumbers;
    }
}


