package at.nacs.exercise6properties_part1_properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("bookstore")
@Getter
@Setter
public class BookLoader {

    private List<Book>book;
}
