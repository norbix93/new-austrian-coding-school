package at.nacs.todo_application;

import at.nacs.todo_application.model.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ToDoRepository extends MongoRepository<ToDo, String> {

    Optional<ToDo> findOneByid(String id);
    Optional<ToDo> deleteToDoByid(String id);

}
