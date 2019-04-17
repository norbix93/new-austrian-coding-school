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

    public ToDo findById(String id) {
        Optional<ToDo> oneById = repository.findById(id);
        return oneById.orElse(null);
    }

    public List<ToDo> findAll() {
        List<ToDo> todos = repository.findAll();
        return todos;
    }

    public ToDo doTask(String id) {
        ToDo itemToChange = findById(id);
        itemToChange.setDone(true);
        repository.save(itemToChange);
        return itemToChange;
    }

    public ToDo save(ToDo toDo) {
        return repository.save(toDo);
    }

    public void deleteItemById(String id) {
        repository.deleteById(id);
    }
}
