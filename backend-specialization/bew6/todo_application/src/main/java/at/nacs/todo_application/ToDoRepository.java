package at.nacs.todo_application;

import at.nacs.todo_application.model.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ToDoRepository extends MongoRepository<ToDo, String> {

    Optional<ToDo> findOneByID(String ID);

    Optional<ToDo> deleteByID(ToDo item);

    List<ToDo> findAll();

    ToDo save();

}
