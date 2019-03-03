package at.nacs.rockpaperscissors.controller;

import at.nacs.rockpaperscissors.model.Move;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
@Builder
public class Spock implements Move {
    @Override
    public String getName() {
        return "spock";
    }

    @Override
    public boolean defeats(Move move) {
        return "scissors".equalsIgnoreCase(move.getName())||"rock".equalsIgnoreCase(move.getName());
    }
}
