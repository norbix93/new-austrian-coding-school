package at.nacs.ex6properties_p2;

import org.junit.After;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class WeekTest {

    @Autowired
    Week week;

    @Test
    void getDays() {
        List<String> actual = week.getDays();
        List<String> expected = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday");
        Assertions.assertEquals(expected, actual);
    }
}