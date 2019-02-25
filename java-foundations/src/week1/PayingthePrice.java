package week1;

import java.util.Scanner;

public class PayingthePrice {

    public static void main(String[] args) {
        System.out.println("How much is your comic?");
        Scanner scanner = new Scanner(System.in);
        Double price = scanner.nextDouble();
        System.out.println("How much are you going to pay?");
        Integer moneyPaid = scanner.nextInt();

        Double change = moneyPaid - price;
        Double euro = Math.floor(change);
        Double cent = (change * 100) % 100;
        cent = Math.ceil(cent);
        System.out.println("Here you are, " + euro + " Euros and " + cent + " cents");

    }
}


