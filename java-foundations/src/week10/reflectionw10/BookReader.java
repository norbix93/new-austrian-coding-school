package week10.reflectionw10;

import week10.exercise1.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookReader {

    FileReader fileReader = new FileReader();
    List<String> book = fileReader.asList("week10/reflectionw10/alice.txt");


    /*public List<String> readLines(String filePath) {
        List<String> getLines = fileReader.asList(filePath);
        for (String line : getLines.toString().split(" ")) {
            String newLine = "";
            List<String> symbols = Arrays.asList(";", "-", ",", "\\.", ":","’s","’","‘","#","/","?",
                    "!","\\*","\\(","\\)","\\[","\\]");
            newLine = line.replaceAll(symbols.toString(), " ");
            readLines.add(newLine);
        }
        return readLines;
    }*/

    protected List<String> readBook(){
        return book.stream()
                .map(word->word.toLowerCase())
                .map(symbol->symbol.replaceAll(";"," "))
                .map(symbol->symbol.replaceAll(","," "))
                .map(symbol->symbol.replaceAll("’s"," "))
                .map(symbol->symbol.replaceAll("’"," "))
                .map(symbol->symbol.replaceAll("‘"," "))
                .map(symbol->symbol.replaceAll(":"," "))
                .map(symbol->symbol.replaceAll("#"," "))
                .map(symbol->symbol.replaceAll("/"," "))
                .map(symbol->symbol.replaceAll("-"," "))
                .map(symbol->symbol.replaceAll("\\."," "))
                .map(symbol->symbol.replaceAll("\\*"," "))
                .map(symbol->symbol.replaceAll("\\("," "))
                .map(symbol->symbol.replaceAll("\\)"," "))
                .map(symbol->symbol.replaceAll("\\["," "))
                .map(symbol->symbol.replaceAll("\\]"," "))
                .map(text->text.split(" "))
                .flatMap(Stream::of)
                .filter(word->!word.isEmpty())
                .collect(Collectors.toList());
    }
}
