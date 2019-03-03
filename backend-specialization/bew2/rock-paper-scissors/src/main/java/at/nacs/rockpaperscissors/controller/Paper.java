package at.nacs.rockpaperscissors.controller;


import at.nacs.rockpaperscissors.model.Move;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
@Builder
public class Paper implements Move {

    @Override
    public String getName() {
        return "paper";
    }

    @Override
    public boolean defeats(Move move) {
        return "rock".equalsIgnoreCase(move.getName())||"spock".equalsIgnoreCase(move.getName());
    }
}

