package week4.exercise5;

import java.util.ArrayList;
import java.util.List;

public class AdvancedShoppingApplication {

    public static void main(String[] args) {

        List<Grocery> groceries = new ArrayList<>();
        System.out.println("Groceries: " + groceries);

        Grocery banana = new Grocery("banana");
        Grocery apple = new Grocery("apple");
        Grocery pear = new Grocery("pear");
        groceries.add(banana);
        groceries.add(apple);
        groceries.add(pear);
        System.out.println("Groceries: " + groceries);

        Grocery pear1 = new Grocery("pear");
        groceries.remove(pear1);
        System.out.println(groceries);

        groceries.add(pear);
        groceries.add(pear);
        System.out.println(groceries);

        groceries.remove(2);
        System.out.println(groceries);

        Integer size = groceries.size();
        System.out.println("Groceries size is: " + size);

    }
}
