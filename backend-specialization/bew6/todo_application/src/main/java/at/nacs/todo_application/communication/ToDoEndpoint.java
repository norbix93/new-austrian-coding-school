package at.nacs.todo_application.communication;

import at.nacs.todo_application.ToDoRepository;
import at.nacs.todo_application.controller.ToDoManager;
import at.nacs.todo_application.model.ToDo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class ToDoEndpoint {

    private final ToDoManager manager;

    @GetMapping("/{ID}")
    ToDo findByID(@PathVariable String id) {
        return manager.findByID(id);
    }

    @GetMapping
    List<ToDo> findAll() {
        return manager.findAll();
    }

    @PutMapping("/{ID}/done")
    ToDo doTask(@PathVariable String id) {
        ToDo itemToChange = findByID(id);
        manager.doTask(id);
        return manager.save(itemToChange);
    }

    @PostMapping
    ToDo receiveNew(@RequestBody ToDo todo) {
        return manager.save(todo);
    }

    @DeleteMapping("/{ID}")
    void delete(@PathVariable String ID) {
        ToDo itemToDelete = findByID(ID);
        manager.deleteItemByid(itemToDelete);

    }
}
