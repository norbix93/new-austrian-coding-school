package week4.exercise7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvancedIndexApplication {

    public static void main(String[] args) {

        Map<Integer, List<Topic>> index = new HashMap<>();
        Integer pageNumberOne = 1;
        Integer pageNumberTwo = 2;
        Topic horror = new Topic("horror");
        Topic comedy = new Topic("comedy");
        Topic drama = new Topic("drama");

        List<Topic> topics1 = new ArrayList<>();
        List<Topic> topics2 = new ArrayList<>();

        topics1.add(horror);
        topics2.add(comedy);
        topics2.add(drama);

        index.put(pageNumberOne, topics1);
        index.put(pageNumberTwo, topics2);
        System.out.println(index.keySet());
        System.out.println(index.values());

        Topic romantic = new Topic("romantic");
        List<Topic> stored = new ArrayList<>();
        stored.add(romantic);
        topics1 = stored;
        System.out.println(topics1);
        if (index.containsKey(1)) {
            System.out.println("Yes, your map contains this key.");
        } else {
            System.out.println("Sorry, your map does not contain this key.");
        }
        List<Topic> stored2 = new ArrayList<>();
        topics2 = stored2;
        System.out.println(topics2);
        Integer size = index.size();
        System.out.println(size);
    }
}
