package week5.exercise7;/*package exercise7;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Human implements Player {

    private  List<Move> moves = Arrays.asList(new Scissors(), new Rock(), new Paper());

    @Override
    public Optional<Move> makeMove() {
        System.out.println("Please, choose your move.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        for (Move move : moves) {
            if (move.getName().equals(userInput)){
                return Optional.of(move);
            } else {
                System.out.println("Invalid Input " + userInput);
                System.out.println("Exiting Game");
            }
        }
        return Optional.empty();
    }
}*/