package week6.exercise4;

import java.util.List;
import java.util.Scanner;

public class GreedyApplication {
    public static void main(String[] args) {
        System.out.println("Please give me your amount!");
        Scanner scanner = new Scanner(System.in);
        Integer amount = scanner.nextInt();
        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();
        List<Money> changedMoney = greedyAlgorithm.change(amount);
        System.out.println("List of coins: " + changedMoney);
        System.out.println("Number of coins " + changedMoney.size());
    }
}
