package at.nacs.rockpaperscissors.controller;

import at.nacs.rockpaperscissors.model.Move;
import org.springframework.stereotype.Component;

@Component
public class Judge {

    public String decide(Move move1, Move move2) {
        if (areTheSame(move1, move2)) {
            return "Nobody wins";
        }
        if (move1.defeats(move2)) {
            return "Player 1 wins";
        }
        return "Player 2 wins";
    }

    private boolean areTheSame(Move move1, Move move2) {
        return move1.getName().equals(move2.getName());
    }
}

