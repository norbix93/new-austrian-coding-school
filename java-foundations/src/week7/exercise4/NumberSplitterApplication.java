package week7.exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberSplitterApplication {

    public static void main(String[] args) {
        NumberSplitter numberSplitter = new NumberSplitter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me some numbers you would like to split: ");
        Integer inputNumber = scanner.nextInt();
        List<Integer> listOfNumbers = Arrays.asList(inputNumber);
        for (int number : listOfNumbers) {
            System.out.println("Your number split look like the following: " + numberSplitter.splitNumbers(number));
        }
    }
}
