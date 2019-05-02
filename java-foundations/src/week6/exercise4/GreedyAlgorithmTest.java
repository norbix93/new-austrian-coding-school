package week6.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class GreedyAlgorithmTest {

    @Test
    void changeZeroTest() {
        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();
        List<Money>actual = greedyAlgorithm.change(0);


        List<Money> expected = Arrays.asList();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void change88Test() {
        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();
        List<Money>actual = greedyAlgorithm.change(88);
        Integer actualSize = actual.size();
        List<Integer> expected = Arrays.asList(50,20,10,5,2,1);
        Integer expectedSize = expected.size();
        Assertions.assertEquals(actualSize, expectedSize);
    }
    @Test
    void change149Test() {
        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();
        List<Money>actual = greedyAlgorithm.change(149);
        Integer actualSize = actual.size();
        List<Money> expected = Arrays.asList(new Cent50(),new Cent50(),new Cent20(),new Cent20(),
                new Cent5(), new Cent2(), new Cent2());
        Integer expectedSize = expected.size();
        Assertions.assertEquals(actualSize, expectedSize);
    }
}