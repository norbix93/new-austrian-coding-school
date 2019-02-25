package week5.exercise4;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SuperheroCaller {


    List<Superhero> superheroes = Arrays.asList(new Spiderman(), new Batman(), new Superman());


    public Superhero call() {
        Collections.shuffle(superheroes);
        return superheroes.get(0);
    }
}
