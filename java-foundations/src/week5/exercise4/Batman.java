package week5.exercise4;

import week5.exercise5.Villain;

public class Batman implements Superhero {
    @Override
    public String getName() {
        return "Batman";
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(new Batman().getName());
    }
}
