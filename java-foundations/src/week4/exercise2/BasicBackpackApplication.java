package week4.exercise2;

import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {


    public static void main(String[] args) {

        Set<String> backpack = new HashSet<>();
        System.out.println(backpack);

        String toothpaste = "toothpaste";
        String towel = "towel";
        String underwear = "underwear";

        backpack.add(toothpaste);
        backpack.add(towel);
        backpack.add(underwear);
        System.out.println(backpack);

        if (backpack.contains(underwear)) {
            System.out.println("The backpack contains underwear.");
        }
        backpack.remove(underwear);
        System.out.println(backpack);

        if (!backpack.contains(underwear)) {
            System.out.println("The backpack no longer contains underwear.");
        }

        backpack.add(underwear);
        backpack.add(underwear);
        System.out.println(backpack);

        Integer size = backpack.size();
        System.out.println("Backpack size: " + size);


    }


}

