package week1;

import java.util.Scanner;

public class DidSomethingClick {

    public static void main(String[] args) {

        if (!hasClicked() && !isAdult()) {
            System.out.println("apologizeAndEnd()");
        } else
            System.out.println("Please, write your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (!isValid()) {
            System.out.println("apologizeAndEnd()");
        } else
            System.out.println("signUp(name)");
        System.out.println("You're signed up! Thank you.");

    }

    private static boolean isValid() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Integer length = name.length();
        return length >= 3;
    }

    private static boolean hasClicked() {


        System.out.println("Did something click?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("Yes");
    }

    private static boolean isAdult() {

        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        Integer answer = scanner.nextInt();
        return answer >= 18;
    }
}