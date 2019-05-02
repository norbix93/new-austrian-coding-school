package week1;

import java.util.Scanner;

public class OldPhone {

    public static void main(String[] args) {

        if (isAtHome && !isUsingOldPhone) {
            System.out.println("Call with cellphone");
        } else {
            System.out.println("Call with old telephone.");
        }

    }

    private static boolean isAtHome;

    {


        System.out.println("Are we at home?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        answer.equalsIgnoreCase("Yes");

    }

    private static boolean isUsingOldPhone;

    {
        System.out.println("Grandma, are you using the old telephone?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        answer.equalsIgnoreCase("Yes");
    }
}