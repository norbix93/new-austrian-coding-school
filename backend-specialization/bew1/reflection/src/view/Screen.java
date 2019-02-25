package view;

import controller.Assistant;
import controller.FruitCounter;
import controller.FruitReader;
import lombok.experimental.UtilityClass;
import model.Fruit;

import java.util.List;

@UtilityClass
public class Screen {
    public void display() {

        List<String> fruits = FruitReader.getFruits("file/delivery.txt");
        List<Fruit> translatedFruits = Assistant.translate(fruits);
        System.out.println("These are all our tasteful fruits: \n");
        FruitCounter.count(translatedFruits).stream()
                .forEach(fruit -> System.out.println(fruit));
    }
}
