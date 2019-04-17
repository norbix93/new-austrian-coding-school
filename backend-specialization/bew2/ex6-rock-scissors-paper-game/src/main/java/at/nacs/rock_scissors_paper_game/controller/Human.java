package at.nacs.rock_scissors_paper_game.controller;

import at.nacs.rock_scissors_paper_game.model.Move;
import at.nacs.rock_scissors_paper_game.model.Player;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Scanner;
@Component
public class Human implements Player {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Move choose() {
        Optional<Move> move = Optional.empty();
        while (!move.isPresent()) {
            move = ask();
        }
        return move.get();
    }

    private Optional<Move> ask() {
        System.out.println("Please, choose one "+ Moves.asString());
        String moveName = scanner.nextLine();
        return Moves.get(moveName);
    }

    @Override
    public boolean wantsToPlayAgain() {
        System.out.println("Do you want to play again? (yes,no)");
        String answer = scanner.nextLine();
        return "yes".equalsIgnoreCase(answer);
    }

}
