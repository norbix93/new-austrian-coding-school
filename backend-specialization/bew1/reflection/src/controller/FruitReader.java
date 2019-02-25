package controller;

import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class FruitReader {

    FileReader reader = new FileReader();

    public List<String> getFruits(String filePath) {
        return reader.asStream(filePath)
                .collect(Collectors.toList());

    }
}
