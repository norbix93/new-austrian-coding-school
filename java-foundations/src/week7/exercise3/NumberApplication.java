package week7.exercise3;

import java.util.Arrays;
import java.util.List;

public class NumberApplication {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 43, 51, 89, 32);
        Numbers numbers1 = new Numbers();
        System.out.println("The biggest number is: " + numbers1.getBiggest(numbers));

        System.out.println("The smallest number is: " + numbers1.getSmallest(numbers));
    }
}
