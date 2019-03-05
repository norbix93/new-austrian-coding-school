package at.nacs.ex6properties_p2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties("bookstore")
public class Book {

    @Getter
    @Setter
    Map<String, Integer> book;
}
