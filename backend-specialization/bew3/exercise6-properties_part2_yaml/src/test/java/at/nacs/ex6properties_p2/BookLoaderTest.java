package at.nacs.ex6properties_p2;

import org.hamcrest.collection.IsMapContaining;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertThat;

@SpringBootTest
class BookLoaderTest {

    @Autowired
    BookLoader bookLoader;

    @ParameterizedTest
    @CsvSource({
            "Harry Potter, 3",
            "The Foundation, 2",
            "The Lord of the Rings, 4"
    })
    void getBooks(String title, Integer copies) {

        List<Book> books = bookLoader.getBook();
        Map<String, Integer> actual = books.stream()
                .collect(Collectors.toMap(e -> e.getTitle(), e -> e.getCopies()));
        assertThat(actual, IsMapContaining.hasEntry(title, copies));
    }
}