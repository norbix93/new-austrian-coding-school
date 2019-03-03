package at.nacs.rockpaperscissors.controller;

import at.nacs.rockpaperscissors.model.Move;
import at.nacs.rockpaperscissors.model.Player;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Builder
public class Game {

    private final Judge judge;
    private final List<Player> players;

    public void play() {
        System.out.println("Welcome to " + Moves.asString());
        play(players);
        System.out.println("See you!");
    }

    private void play(List<Player> players) {
        Player player1 = players.get(0);
        Player player2 = players.get(1);
        boolean playAgain = true;
        while (playAgain) {
            playOneRound(player1, player2);
            playAgain = ask(player1, player2);
        }
    }

    private void playOneRound(Player player1, Player player2) {
        Move move1 = player1.choose();
        Move move2 = player2.choose();
        System.out.println("Player 1 chooses: " + move1.getName());
        System.out.println("Player 2 chooses: " + move2.getName());
        String winner = judge.decide(move1, move2);
        System.out.println(winner);
    }

    private boolean ask(Player player1, Player player2) {
        return player1.wantsToPlayAgain() && player2.wantsToPlayAgain();
    }
}

