package at.nacs.todo_application;

import at.nacs.todo_application.model.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ToDoRepository extends MongoRepository<ToDo, String> {

    Optional<ToDo> findOneByiD(String ID);

    Optional<ToDo> deleteToDoByiD(String ID);

    List<ToDo> findAll();

    ToDo save(ToDo itemToSave);

}
