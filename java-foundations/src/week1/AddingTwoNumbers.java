package week1;

import java.util.Scanner;

public class AddingTwoNumbers {


    public static void main(String[] args) {

        System.out.println("Tell me your first number");
        Scanner scanner = new Scanner(System.in);
        Integer number1 = scanner.nextInt();
        System.out.println("Tell me your second number");
        Integer number2 = scanner.nextInt();
        Integer sum = number1 + number2;
        System.out.println("The sum is: " + sum);

    }
}