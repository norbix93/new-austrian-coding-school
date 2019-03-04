package at.nacs.ex6properties_part_1properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.*;

@Configuration
@EnableAutoConfiguration
@ComponentScan
class BallerinaTest {

    @Autowired
    Ballerina ballerina;

    @Test
    void getPerformanceQuality1() {
        int actual = ballerina.getPerformanceQuality1();
        Assertions.assertEquals(1, actual);
    }

    @Test
    void getPerformanceQuality2() {
        int actual = ballerina.getPerformanceQuality2();
        Assertions.assertEquals(3, actual);
    }

    @Test
    void getPerformanceQuality3() {
        int actual = ballerina.getPerformanceQuality3();
        Assertions.assertEquals(5, actual);
    }
}