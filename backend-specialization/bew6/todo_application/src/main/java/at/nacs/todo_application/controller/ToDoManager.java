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

    public ToDo findByID(String ID) {
        Optional<ToDo> oneByid = repository.findOneByID(ID);
        return oneByid.orElse(null);
    }

    public List<ToDo> findAll() {
        List<ToDo> todos = repository.findAll();
        return todos;
    }

    public void doTask(String id) {
        ToDo itemToChange = findByID(id);
        itemToChange.setDone(true);
    }

    public ToDo save(ToDo itemToSave) {
        return repository.save();
    }

    public void deleteItemByid(ToDo item) {
        repository.deleteByID(item);
    }
}
