package controller;

import lombok.experimental.UtilityClass;
import model.Fruit;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class FruitCounter {

    public List<String> count(List<Fruit> fruits) {
        return fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getName, Collectors.counting()))
                .entrySet().stream()
                .map(e -> "Fruit: " + e.getKey() + " | " + "Amount: " + e.getValue())
                .collect(Collectors.toList());

    }
}
