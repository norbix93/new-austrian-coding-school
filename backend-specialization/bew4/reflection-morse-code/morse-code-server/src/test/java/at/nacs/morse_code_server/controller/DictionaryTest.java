package at.nacs.morse_code_server.controller;

import at.nacs.morse_code_server.model.Entry;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class DictionaryTest {

    @Autowired
    Dictionary dictionary;


    @Test
    void createMap() {
        Integer expected = 36;
        Integer actual = dictionary.createMap().size();
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void getEntry() {
        List<Entry> actual = dictionary.getEntry();
        assertThat(actual).isNotNull();
    }
}