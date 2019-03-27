package at.nacs.todo_application;

import at.nacs.todo_application.model.ToDo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ToDoRunner {

    @Bean
    ApplicationRunner applicationRunner(List<ToDo> todos, ToDoRepository repository) {
        return args -> {

            System.out.println("---SAVE---");
            repository.saveAll(todos);
            System.out.println("---FIND---");
            List<ToDo> all = repository.findAll();
            all.forEach(System.out::println);
//            System.out.println("---DELETE---");
//            repository.deleteAll();

        };
    }
}
