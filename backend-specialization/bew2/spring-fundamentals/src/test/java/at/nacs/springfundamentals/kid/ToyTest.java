package at.nacs.springfundamentals.kid;

import at.nacs.springfundamentals.kid.Toy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ToyTest {

    @Autowired
    Toy toy;

    @Test
    void getName() {
        assertEquals("Vector", toy.getName());
    }
}