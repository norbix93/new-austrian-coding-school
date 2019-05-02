package week6.exercise5;

import java.util.Scanner;

public class CreditApplication {

    public static void main(String[] args) {

        System.out.println("Please give me your credit card number!");
        Scanner scanner = new Scanner(System.in);
        Long cardNumber = scanner.nextLong();
        Credit credit = new Credit();
        credit.credit(cardNumber);
        String creditCardNumberToString = cardNumber.toString();
        LuhnsAlgorithm luhnsAlgorithm = new LuhnsAlgorithm();
        if (luhnsAlgorithm.legitimate(creditCardNumberToString)) {
            System.out.println("Your card number " + cardNumber + " is legit.");
        } else {
            System.out.println("Your card number " + cardNumber + " is NOT legit.");
        }
    }
}

