package at.nacs.rock_scissors_paper_game.controller;


import at.nacs.rock_scissors_paper_game.model.Move;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
@Builder
public class Lizard implements Move {
    @Override
    public String getName() {
        return "lizard";
    }

    @Override
    public boolean defeats(Move move) {
        return "spock".equalsIgnoreCase(move.getName())||"paper".equalsIgnoreCase(move.getName());
    }
}
