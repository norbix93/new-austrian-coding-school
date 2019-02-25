package week3.exercise4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RubbishChunkMaker {

    public String makeRubbishChunk() {

        List<String> rubbishCharacters = Arrays.asList("!", "@", "#", "$", "%", "&", "+", "-", "=");
        Random random = new Random();
        String rubbishChunk = "";
        int randomTimes = random.nextInt(5) + 1;
        Collections.shuffle(rubbishCharacters);

        for (int position = 0; position <= randomTimes; position++) {
            rubbishChunk += rubbishCharacters.get(position);
        }
        return rubbishChunk;
    }

}
