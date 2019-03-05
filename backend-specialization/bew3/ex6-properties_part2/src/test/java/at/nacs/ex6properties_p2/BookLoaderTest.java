package at.nacs.ex6properties_p2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class BookTest {

    @Autowired
    Book book;

    @Test
    void getBooks() {
        Map<String, Integer> actual = book.getBook();
        Map<String, Integer> expected = new HashMap<>();
        String book1 = "HarryPotter";
        String book2 = "TheFoundation";
        String book3 = "TheLordoftheRings";
        Integer copies1 = 3;
        Integer copies2 = 2;
        Integer copies3 = 4;
        expected.put(book1, copies1);
        expected.put(book2, copies2);
        expected.put(book3, copies3);
        Assertions.assertEquals(expected, actual);
    }
}