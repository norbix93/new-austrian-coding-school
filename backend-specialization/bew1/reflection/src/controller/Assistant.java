package controller;

import lombok.experimental.UtilityClass;
import model.Fruit;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class Assistant {

    public List<Fruit> translate(List<String> fruits) {
        List<Fruit> allFruits = new ArrayList<>();
        for (String fruit : fruits) {
            allFruits.add(Fruit.builder().name(fruit).build());
        }
        return allFruits;
    }
}
