package week1;

import java.util.Scanner;

public class CalculateSquare {

    public static void main(String[] args) {

        System.out.println("Give me your first number");
        Scanner scanner = new Scanner(System.in);
        Integer number1 = scanner.nextInt();
        Integer sum1 = number1 * number1;
        System.out.println("The sum is: " + sum1);

        System.out.println("Give me your second number");
        Integer number2 = scanner.nextInt();
        Integer sum2 = number2 * number2;
        System.out.println("The sum is: " + sum2);
    }
}
