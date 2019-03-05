package at.nacs.ex6properties_p2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("bookstore")
public class BookLoader {

    @Getter
    @Setter
    private List<Book> book;
}
