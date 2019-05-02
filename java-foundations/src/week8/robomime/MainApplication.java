package week8.robomime;

public class MainApplication {

    public static void main(String[] args) {
        SpecialMoves specialMoves = new SpecialMoves();
        System.out.println("Number of unique tricks: " + specialMoves.getNumberOfTricks());
        System.out.println("Tricks: " + specialMoves.getSpecialMoves());
    }
}
