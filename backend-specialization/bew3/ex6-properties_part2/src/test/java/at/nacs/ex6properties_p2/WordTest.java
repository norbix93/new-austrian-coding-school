package at.nacs.ex6properties_p2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class WordTest {

    @Autowired
    Word word;

    @Test
    void getMeaning() {
        String actual = word.getMeaning();
        Assertions.assertEquals("fantastic",actual);
    }
}