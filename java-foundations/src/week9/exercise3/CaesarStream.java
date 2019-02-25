package week9.exercise3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CaesarStream {

    public String chiper(String plantext, Integer key) {
        return Stream.of(plantext.split("")).map(letter -> cipherLetter(letter, key)).collect(Collectors.joining());
    }


    public String cipherLetter(String letter, Integer key) {
        int valueOfLetter = letter.charAt(0);
        int shiftedValue = valueOfLetter + key;
        if (isCapitalLetter(valueOfLetter)) {
            shiftedValue = (shiftedValue - 65) % 26 + 65;
        } else {
            shiftedValue = (shiftedValue - 97) % 26 + 97;
        }
        Character newletter = (char) shiftedValue;
        return newletter.toString();
    }

    private Boolean isCapitalLetter(int valueOfLetter) {
        return Character.isUpperCase(valueOfLetter);
    }
}

