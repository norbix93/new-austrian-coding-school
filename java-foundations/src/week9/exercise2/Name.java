package week9.exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class Name {

    private FileReader reader = new FileReader();
    private List<String> names = reader.asList("week9/exercise2/names.txt");

    protected List<String> getNamesWithFourCharacters(String filePath) {
        return reader.asStream(filePath)
                .filter(name -> name.length() < 4)
                .collect(Collectors.toList());
    }

    protected List<String> getNamesWithM(String filePath) {
        return reader.asStream(filePath)
                .filter(name -> name.startsWith("M"))
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
    }

    protected List<String> getNamesWithEandR(String filePath) {
        return reader.asStream(filePath)
                .filter(name -> name.contains("e"))
                .filter(name -> name.contains("r"))
                .collect(Collectors.toList());
    }

    protected List<String> getNamesWithAandM(String filePath) {
        return reader.asStream(filePath)
                .filter(name -> name.length() == 4)
                .map(name -> name.toLowerCase())
                .filter(name -> name.contains("a"))
                .filter(name -> name.contains("m"))
                .map(name -> name.replaceAll("a", "aa"))
                .collect(Collectors.toList());

    }
}
