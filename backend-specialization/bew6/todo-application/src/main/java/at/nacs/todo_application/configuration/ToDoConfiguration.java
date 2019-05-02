package at.nacs.todo_application.configuration;

import at.nacs.todo_application.model.ToDo;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("dataset")
public class ToDoConfiguration {

    @Setter
    private List<ToDo> todos;

    @Setter
    private ToDo toDo;

    @Bean
    List<ToDo> todos() {
        return todos;
    }

    @Bean
    ToDo toDo() {
        return toDo;
    }
}
