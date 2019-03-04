package at.nacs.ex6properties_part_1properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BallerinaTest {

    @Autowired
    Ballerina ballerina;

    @Test
    void getDanceQuality1() {
        int actual = ballerina.getPerformanceQuality1();
        Assertions.assertEquals(1, actual);
    }

    @Test
    void getDanceQuality2() {
        int actual = ballerina.getPerformanceQuality2();
        Assertions.assertEquals(3, actual);
    }

    @Test
    void getDanceQuality3() {
        int actual = ballerina.getPerformanceQuality3();
        Assertions.assertEquals(5, actual);
    }
}