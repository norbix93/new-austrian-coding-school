package week8.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {

    Predicate<Integer> conditionOdd = number -> number % 2 == 1;
    Predicate<Integer> conditionEven = number -> number % 2 == 0;

    protected List<Integer> getEven(List<Integer> list){
        return filterNumbers(list,conditionEven);
    }
    protected List<Integer> getOdd(List<Integer> list) {
        return filterNumbers(list, conditionOdd);
    }


    protected List<Integer> filterNumbers(List<Integer> listOfNumbers, Predicate<Integer> condition) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : listOfNumbers) {
            if (condition.test(number)) {
                filteredNumbers.add(number);
            }
        }
        return filteredNumbers;

    }
}
