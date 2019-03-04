package at.nacs.ex6properties_part_1properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SaunaTest {

    @Autowired
    Sauna sauna;

    @Test
    void getAvailableSeats() {
        int actual = sauna.getAvailableSeats();
        Assertions.assertEquals(3, actual);

    }

    @Test
    void getTemperature() {
        int actual = sauna.getTemperature();
        Assertions.assertEquals(35, actual);
    }
}