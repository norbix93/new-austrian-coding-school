package at.nacs.reflection.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class HandshakeLoaderTest {

    @Autowired
    HandshakeLoader loader;

    @Test
    void getHandshakes() {
        int actual = new ArrayList<>(loader.createMapOfHandshakes()
                .entrySet())
                .size();
        Assertions.assertEquals(5, actual);
    }
}