package at.nacs.springfundamentals.school;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SchoolTest {

    @Autowired
    School school;

    @Test
    void getChildrenNames() {
        List<Child> actual = school.getChildren();

        List<String> actualNames = actual.stream()
                .map(Child::getName)
                .collect(Collectors.toList());

        List<String> expectedNames = List.of("Khajag", "Leen", "Omar");
        assertEquals(expectedNames, actualNames);
    }
}