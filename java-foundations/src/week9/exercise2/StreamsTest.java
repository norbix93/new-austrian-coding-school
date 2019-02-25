package week9.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class StreamsTest {

    Name name = new Name();


    @Test
    void getNamesWith4Characters() {
        List<String> actual = name.getNamesWithFourCharacters("week9/exercise2/names.txt");
        List<String> expected = Arrays.asList("El");
        Assertions.assertEquals(expected, actual);
    }

    void getNamesWithM() {
        List<String> actual = name.getNamesWithM("week9/exercise2/names.txt");
        List<String> expected = Arrays.asList("MAHTAB", "MARJ", "MEHRAN", "MOHAMED", "MOUSTAFA");
        Assertions.assertEquals(expected, actual);
    }

    void getNamesWithRandE() {
        List<String> actual = name.getNamesWithEandR("week9/exercise2/names.txt");
        List<String> expected = Arrays.asList("Mehran", "Norbert", "Serife");
        Assertions.assertEquals(expected, actual);
    }

    void getNamesWithAandM() {
        List<String> actual = name.getNamesWithAandM("week9/exercise2/names.txt");
        List<String> expected = Arrays.asList("maarj", "aamin", "omaar");
        Assertions.assertEquals(expected, actual);
    }
}