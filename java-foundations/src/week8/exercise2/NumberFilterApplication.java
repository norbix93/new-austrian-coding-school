package week8.exercise2;

import java.util.Arrays;
import java.util.List;

public class NumberFilterApplication {
    public static void main(String[] args) {
        NumberFilter filter = new NumberFilter();
        List<Integer> randomNumbers = Arrays.asList(1, 3, 5, 4, 2, 8, 13, 16, 89, 43);
        List<Integer> evenNumbers = filter.getEven(randomNumbers);
        System.out.println("The even numbers are: " + evenNumbers);
        List<Integer> oddNumbers = filter.getOdd(randomNumbers);
        System.out.println("The odd numbers are: " + oddNumbers);
    }
}
