package week5.exercise5;

import week5.exercise4.SuperheroCaller;

public class AdvancedSuperheroApplication {
    public static void main(String[] args) {
        SuperheroCaller superheroCaller = new SuperheroCaller();
        Joker joker = new Joker();
        Integer times = 0;
        while (times < 10) {
            superheroCaller.call().fight(joker);
            times = times + 1;
        }
    }
}

