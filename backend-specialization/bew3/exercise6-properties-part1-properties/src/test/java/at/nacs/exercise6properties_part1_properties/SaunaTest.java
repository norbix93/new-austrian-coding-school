package at.nacs.exercise6properties_part1_properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SaunaTest {

    @Autowired
    Sauna sauna;

    @Test
    void getTemperature() {
        int actual = sauna.getTemperature();
        Assertions.assertEquals(35, actual);
    }

    @Test
    void getAvailableSeats() {
        int actual = sauna.getAvailableSeats();
        Assertions.assertEquals(3,actual);
    }
}