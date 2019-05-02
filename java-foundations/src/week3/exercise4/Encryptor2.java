package week3.exercise4;

import java.util.Arrays;
import java.util.List;

public class Encryptor2 {
    

        public String encrypt(String message) {

            TextAlterator textAlterator = new TextAlterator();

            message = textAlterator.alter(message);
            message = addRubbishSymbols(message);
            return message;
        }

        public String addRubbishSymbols(String message) {

            String[] elements = message.split("");
            List<String> letters = Arrays.asList(elements);


            String encryptedMessage = "";

            for (String letter : letters) {
                RubbishChunkMaker rbh = new RubbishChunkMaker();
                encryptedMessage += letter;
                String rubbishChunk = rbh.makeRubbishChunk();
                encryptedMessage += rubbishChunk;
            }
            return encryptedMessage;
        }
}
