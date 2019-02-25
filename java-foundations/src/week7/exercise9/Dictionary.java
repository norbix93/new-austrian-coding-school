package week7.exercise9;

import week4.exercise9.FileReader;

import java.util.List;

public class Dictionary extends Read {

    protected List<String> getDictionary() {
        FileReader fileReader = new FileReader();
        List<String> dictionary = fileReader.getLines
                ("exercise9/words.txt");
        return dictionary;
    }

}
