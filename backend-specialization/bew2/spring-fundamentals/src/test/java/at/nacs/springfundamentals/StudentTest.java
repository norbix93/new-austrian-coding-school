package at.nacs.springfundamentals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentTest {

    @Autowired
    Student student;

    @Test
    void wantsToHaveABreak() {
        String actual = student.wantsToHaveABreak();

        String expected = "Plis, a break.";
        Assertions.assertEquals(expected, actual);
    }
}