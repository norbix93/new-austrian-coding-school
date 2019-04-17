package at.nacs.rock_scissors_paper_game.controller;

import at.nacs.rock_scissors_paper_game.model.Move;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.*;
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

