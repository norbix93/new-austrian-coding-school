package week10.exercise3;

import week10.exercise1.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class smsReader {

    private FileReader reader = new FileReader();

    public List<SMS> getSMS(String filePath) {
        return reader.asStream("week10/exercise3/sms.csv")
                .skip(1)
                .map(symbol -> symbol.replaceAll(";;;", ""))
                .map(line -> line.split(";"))
                .map(columns -> new SMS(columns[0], columns[1]))
                .collect(Collectors.toList());
    }
}
