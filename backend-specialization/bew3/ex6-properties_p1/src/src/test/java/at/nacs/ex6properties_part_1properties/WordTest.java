package at.nacs.ex6properties_part_1properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WordTest {

    @Autowired
    Word word;

    @Test
    void getMeaning() {
        String actual = word.getMeaning();
        Assertions.assertEquals("fantastic", actual);
    }
}