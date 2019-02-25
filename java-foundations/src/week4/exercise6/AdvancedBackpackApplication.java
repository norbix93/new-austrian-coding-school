package week4.exercise6;

import java.util.HashSet;
import java.util.Set;

public class AdvancedBackpackApplication {

    public static void main(String[] args) {
        Set<Item> items = new HashSet<>();
        System.out.println(items);
        Item toothpaste = new Item("toothpaste");
        Item towel = new Item("towel");
        Item underwear = new Item("underwear");

        items.add(toothpaste);
        items.add(towel);
        items.add(underwear);
        System.out.println(items);

        Item toothpase1 = new Item("toothpaste");
        toothpaste.equals(toothpase1);
        items.remove(toothpaste);
        System.out.println(items);

        if (items.contains(towel)) {
            System.out.println("Yes, your backpack has a towel inside.");
        } else {
            System.out.println("You have to put a towel inside!");
        }

        items.add(toothpaste);
        items.add(toothpaste);
        System.out.println(items);

        Integer size = items.size();
        System.out.println("The number of items inside is: " + size);
    }
}
