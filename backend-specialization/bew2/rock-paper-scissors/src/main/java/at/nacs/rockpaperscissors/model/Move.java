package at.nacs.rockpaperscissors.model;

public interface Move {

    String getName();

    boolean defeats(Move move);

}

