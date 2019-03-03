package at.nacs.rockpaperscissors.controller;


import at.nacs.rockpaperscissors.model.Move;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
@Builder
public class Rock implements Move {

    @Override
    public String getName() {
        return "rock";
    }

    @Override
    public boolean defeats(Move move) {

        return "scissors".equalsIgnoreCase(move.getName())||"lizard".equalsIgnoreCase(move.getName());
    }
}
