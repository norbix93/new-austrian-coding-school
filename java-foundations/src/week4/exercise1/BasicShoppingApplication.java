package week4.exercise1;

import java.util.ArrayList;
import java.util.List;

public class BasicShoppingApplication {

    public static void main(String[] args) {
        List<String> groceries = new ArrayList<>();
        System.out.println(groceries);

        String bananas = "bananas";
        String oranges = "oranges";
        String tomatoes = "tomatoes";

        groceries.add(bananas);
        groceries.add(oranges);
        groceries.add(tomatoes);
        System.out.println(groceries);

        groceries.remove(tomatoes);
        System.out.println(groceries);

        groceries.add(tomatoes);
        groceries.add(tomatoes);
        System.out.println(groceries);

        groceries.remove(2);
        System.out.println(groceries);

        Integer size = groceries.size();
        System.out.println(size);
    }
}
