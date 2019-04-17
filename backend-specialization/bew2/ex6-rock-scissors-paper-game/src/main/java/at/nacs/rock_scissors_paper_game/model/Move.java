package at.nacs.rock_scissors_paper_game.model;

public interface Move {

    String getName();

    boolean defeats(Move move);

}

