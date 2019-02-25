package week5.exercise4;

import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {

    public static void main(String[] args) {

        SuperheroCaller superheroCaller = new SuperheroCaller();
        System.out.println(superheroCaller.call());

        List<Superhero> superheroList = new ArrayList<>();
        for (int numberOfSuperheroes = 0; numberOfSuperheroes < 6; numberOfSuperheroes++) {
            superheroList.add(superheroCaller.call());
        }

        int counter = 1;
        for (Superhero superhero : superheroList) {
            System.out.println("Superhero " + counter + ": " + superhero);
            counter++;
        }
        Integer numberOfSuperheroes = superheroList.size();
        System.out.println("Number of superheroes: " + numberOfSuperheroes);

    }
}
