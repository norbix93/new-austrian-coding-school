package at.nacs.rock_scissors_paper_game.controller;

import at.nacs.rock_scissors_paper_game.model.Move;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
@Builder
public class Scissors implements Move {
    @Override
    public String getName() {
        return "scissors";
    }

    @Override
    public boolean defeats(Move move) {
        return "paper".equalsIgnoreCase(move.getName())||"lizard".equalsIgnoreCase(move.getName());
    }

}
