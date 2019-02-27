package at.nacs.rock_scissors_paper_game.controller;

import at.nacs.rock_scissors_paper_game.model.Move;
import at.nacs.rock_scissors_paper_game.model.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
@Component
@RequiredArgsConstructor
public class Computer implements Player {

        private Random random = new Random();
        private final List<Move>moves;

        @Override
        public Move choose() {
            int position = random.nextInt(moves.size());
            return moves.get(position);
        }

        @Override
        public boolean wantsToPlayAgain() {
            return true;
        }
    }

