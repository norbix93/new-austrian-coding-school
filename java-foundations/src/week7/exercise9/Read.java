package week7.exercise9;

import week4.exercise9.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Read {


    List<String> readLines = new ArrayList<>();
    FileReader fileReader = new FileReader();

    public List<String> readLines(String filePath) {
        List<String> getLines = fileReader.getLines(filePath);
        for (String line : getLines.toString().split(" ")) {
            String newLine = "";
            List<String> symbols = Arrays.asList(";", "!", "-", "?", ",", ".", ":");
            newLine = line.replaceAll(symbols.toString(), "");
            readLines.add(newLine);
        }
        return readLines;
    }

    protected Integer getNumberOfWords(List<String>readLines) {
        Integer counter = readLines.size();
        return counter;
    }
}

        /*List<String> newWords = new ArrayList<>(Arrays.asList());
        //     Arrays.asList(getLines.toString().split(" "));
        for (String getLine : getLines) {
            newWords.toArray(getLine.split(" "));
        }
        return newWords;*/
