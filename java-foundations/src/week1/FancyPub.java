package week1;

import java.util.Scanner;

public class FancyPub {


    public static void main(String[] args) {

        System.out.println("Hello! What`s your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Tell me your order number.");
        Integer orderNumber = scanner.nextInt();
        Integer result = orderNumber % 3;
        Integer price = result * 4;
        System.out.println("Here you are, " + name + "!" + " It's " + price + " Euro.");


    }
}
