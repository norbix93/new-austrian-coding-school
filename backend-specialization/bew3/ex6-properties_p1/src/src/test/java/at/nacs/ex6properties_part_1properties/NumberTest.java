package at.nacs.ex6properties_part_1properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class NumberTest {

    @Autowired
    Number number;

    @Test
    void getValue() {
        int actual = number.getValue();
        Assertions.assertEquals(369, actual);
    }
}