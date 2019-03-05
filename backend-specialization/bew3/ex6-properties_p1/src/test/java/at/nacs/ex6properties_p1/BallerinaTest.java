package at.nacs.ex6properties_p1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BallerinaTest {

    @Autowired
    Ballerina ballerina;

    @Test
    public void getPerformanceQuality1() {
        Integer actual = ballerina.getPerformanceQuality1();
        Integer expected = 1;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getPerformanceQuality2() {
        Integer actual = ballerina.getPerformanceQuality2();
        Integer expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPerformanceQuality3() {
        Integer actual = ballerina.getPerformanceQuality3();
        Integer expected = 5;
        Assertions.assertEquals(expected, actual);

    }
}