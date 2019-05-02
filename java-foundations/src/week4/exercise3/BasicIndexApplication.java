package week4.exercise3;

import java.util.HashMap;
import java.util.Map;

public class BasicIndexApplication {


    public static void main(String[] args) {

        Map<Integer, String> index = new HashMap<>();
        System.out.println(index);
        Integer pageNumberOne = 1;
        Integer pageNumberTwo = 2;
        Integer pageNumberThree = 3;
        String horror = "horror";
        String comedy = "comedy";
        String drama = "drama";

        index.put(pageNumberOne, horror);
        index.put(pageNumberTwo, comedy);
        index.put(pageNumberThree, drama);
        System.out.println(index);

        System.out.println(index.keySet());
        System.out.println(index.values());

        String romantic = "romantic";
        index.put(pageNumberThree, romantic);
        System.out.println(index);

        boolean isRomanticThere = index.containsKey(1);
        if (isRomanticThere) {
            System.out.println("The page number one is there.");
        }

        Integer size = index.size();
        System.out.println("The size is: " + size);


    }
}


