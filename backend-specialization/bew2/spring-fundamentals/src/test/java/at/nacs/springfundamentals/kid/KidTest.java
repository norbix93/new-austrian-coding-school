package at.nacs.springfundamentals.kid;

import at.nacs.springfundamentals.kid.Kid;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KidTest {

    @Autowired
    Kid kid;

    @Test
    void getFavouriteToyName() {
        String actual = kid.getFavouriteToyName();

        String expected = "My favourite toy is Vector";
        assertEquals(expected, actual);
    }
}