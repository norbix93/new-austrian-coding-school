package at.nacs.exercise6properties_part1_properties;

import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BallerinaTest {

    @Autowired
    Ballerina ballerina;

    @org.junit.jupiter.api.Test
    void getPerformanceQuality1() {
        int actual = ballerina.getPerformanceQuality1();
        Assertions.assertEquals(1, actual);
    }

    @org.junit.jupiter.api.Test
    void getPerformanceQuality2() {
        int actual = ballerina.getPerformanceQuality2();
        Assertions.assertEquals(3, actual);
    }

    @org.junit.jupiter.api.Test
    void getPerformanceQuality3() {
        int actual = ballerina.getPerformanceQuality3();
        Assertions.assertEquals(5, actual);
    }
}