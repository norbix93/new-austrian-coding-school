package at.nacs.rockpaperscissors.controller;

import at.nacs.rockpaperscissors.model.Move;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class Moves {

    private static List<Move> moves;

    public static List<String> asString() {
        return moves.stream()
                .map(move -> move.getName())
                .collect(Collectors.toList());
    }

    public static Optional<Move> get(String moveName) {
        return moves.stream()
                .filter(move -> move.getName().equalsIgnoreCase(moveName))
                .findFirst();

    }
}

