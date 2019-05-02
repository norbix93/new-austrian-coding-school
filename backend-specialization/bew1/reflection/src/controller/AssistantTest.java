package controller;

import model.Fruit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AssistantTest {

    @Test
    void testGetAllFruits(){
        Fruit apple = Fruit.builder().name("Apple").build();
        Fruit watermelon = Fruit.builder().name("Watermelon").build();
        Fruit orange = Fruit.builder().name("Orange").build();
        Fruit banana = Fruit.builder().name("Banana").build();
        List<Fruit>expected = Arrays.asList(apple,watermelon,orange,banana);
        List<Fruit>actual = Assistant.translate(FruitReader.getFruits("file/delivery.txt"))
                .stream()
                .distinct()
                .collect(Collectors.toList());
        Assertions.assertEquals(expected.size(),actual.size());
    }
}
