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
        int actual = ballerina.getPerformanceQuality1();
        Assertions.assertEquals(1, actual);

    }

    @Test
    public void getPerformanceQuality2() {
        int actual = ballerina.getPerformanceQuality2();
        Assertions.assertEquals(3, actual);


    }

    @Test
    public void getPerformanceQuality3() {
        int actual = ballerina.getPerformanceQuality3();
        Assertions.assertEquals(5, actual);

    }
}