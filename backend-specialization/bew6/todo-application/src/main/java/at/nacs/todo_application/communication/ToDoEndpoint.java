package at.nacs.todo_application.communication;

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

    @GetMapping("/{id}")
    ToDo get(@PathVariable String id) {
        return manager.findById(id);
    }

    @GetMapping
    List<ToDo> get() {
        return manager.findAll();
    }

    @PutMapping("/{id}/done")
    ToDo put(@PathVariable String id) {
        ToDo itemToChange = get(id);
        manager.doTask(id);
        return manager.save(itemToChange);
    }

    @PostMapping
    ToDo post(@RequestBody ToDo todo) {
        return manager.save(todo);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable String id) {
        ToDo itemToDelete = get(id);
        manager.deleteItemById(itemToDelete.getId());

    }
}
