package week7.exercise2;

import java.util.ArrayList;
import java.util.List;

public class NicknameCreator {

    List<String> createNicknames() {
        ListOfWords listOfWords = new ListOfWords();
        List<String> nicknames = new ArrayList<>();
        for (String word : listOfWords.getWords()) {
            Integer endOfWord = word.length() / 2;
            String nickname = word.substring(0, endOfWord);
            nicknames.add(nickname);
        }
        return nicknames;
    }
}

