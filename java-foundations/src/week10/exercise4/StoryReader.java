package week10.exercise4;

import week10.exercise1.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StoryReader {

    private FileReader reader = new FileReader();

    public List<Book> getCharacters(String filePath) {
        return reader.asStream("week10/exercise4/got-characters.csv")
                .skip(1)
                .map(line -> line.split(";"))
                .map(columns -> new Book(columns[0], columns[1], columns[2],
                        columns[3], columns[4], columns[5], Integer.valueOf(columns[6]), Integer.valueOf(columns[7]),
                        Integer.valueOf(columns[8]),
                        Integer.valueOf(columns[9]), Integer.valueOf(columns[10]),
                        Integer.valueOf(columns[11]), Integer.valueOf(columns[12])))
                .collect(Collectors.toList());
    }
}
