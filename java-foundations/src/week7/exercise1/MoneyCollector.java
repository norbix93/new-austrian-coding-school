package week7.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoneyCollector {

    public List<Integer> collectPayments() {
        List<Integer> possibleValues = Arrays.asList(1, 2, 3, 4, 5);
        //Random random = new Random();
        //int randomPosition = random.nextInt(5);
        List<Integer> collectionOfPayments = new ArrayList<>();
        for (int times = 0; times < 10; times++) {
            Collections.shuffle(possibleValues);
            collectionOfPayments.add(possibleValues.get(0));
        }
        return collectionOfPayments;
    }

}
