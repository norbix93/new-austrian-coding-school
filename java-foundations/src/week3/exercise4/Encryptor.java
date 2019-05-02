package week3.exercise4;/*package week3.exercise4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Encryptor {

    public List<String> encrypt(String word) {

        // List
        List<String> immutableSymbols = Arrays.asList("@", "#", "$", "%", "&", "*", "+", "-", "=");

        // To control it
        List<String> mutableSymbols = new ArrayList<>(immutableSymbols);

        List<String> newText;
        String[] words = word.split("");
        newText = Arrays.asList(words);

        List<String> mutableText = new ArrayList<>(newText);

        List<String> encryptedText = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < mutableText.size(); i++) {
            String textValue = mutableText.get(i);
            encryptedText.add(textValue);

            Integer randomNumber = random.nextInt(5) + 1;
            for (int j = 0; j < randomNumber; j++) {
                String symbolValue = immutableSymbols.get(random.nextInt(8) + 1);
                encryptedText.add(symbolValue);
            }
        }


        return encryptedText;
    }

    public String ListToString(List<String> list) {
        String text = String.join("", list);

        return text;
    }

    public String replaceVowels(String word) {

        word = word.replaceAll("[Aa]", "4");
        word = word.replaceAll("[Ee]", "3");
        word = word.replaceAll("[Ii]", "1");
        word = word.replaceAll("[Oo]", "8");
        word = word.replaceAll("[Uu]", "9");

        word = word.replaceAll("[.]", "dot");
        word = word.replaceAll("[,]", "comma");

        System.out.println(word);

        return word;
    }

}*/