package week1;

import java.util.Scanner;

public class TastyBits {

    public static void main(String[] args) {

        System.out.println("Woof food do I get today?!");
        Scanner scanner = new Scanner(System.in);
        Integer food = scanner.nextInt();
        Integer jumpTimes = 6 * food;
        Integer barkTimes = 1 + food;
        System.out.println("(Jumps " + jumpTimes + " times and barks " + barkTimes + " times)");

    }
}
