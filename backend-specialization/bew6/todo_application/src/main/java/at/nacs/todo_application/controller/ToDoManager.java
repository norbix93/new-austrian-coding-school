package at.nacs.todo_application.controller;

import at.nacs.todo_application.ToDoRepository;
import at.nacs.todo_application.model.ToDo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ToDoManager {

    private final ToDoRepository repository;

    public ToDo findByiD(String iD) {
        Optional<ToDo> oneByiD = repository.findOneByiD(iD);
        return oneByiD.orElse(null);
    }

    public List<ToDo> findAll() {
        List<ToDo> todos = repository.findAll();
        return todos;
    }

    public ToDo doTask(String iD) {
        ToDo itemToChange = findByiD(iD);
        itemToChange.setDone(true);
        return itemToChange;
    }

    public ToDo save(ToDo itemToSave) {
        return repository.save(itemToSave);
    }

    public void deleteItemByiD(String iD) {
        repository.deleteToDoByiD(iD);
    }
}
