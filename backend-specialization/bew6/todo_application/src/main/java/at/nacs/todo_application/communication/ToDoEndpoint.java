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

    @GetMapping("/iD/{iD}")
    ToDo findByID(@PathVariable String iD) {
        return manager.findByiD(iD);
    }

    @GetMapping
    List<ToDo> findAll() {
        return manager.findAll();
    }

    @PutMapping("/iD/{iD}/done")
    ToDo doTask(@PathVariable String iD) {
        ToDo itemToChange = findByID(iD);
        manager.doTask(iD);
        return manager.save(itemToChange);
    }

    @PostMapping
    ToDo receiveNew(@RequestBody ToDo todo) {
        return manager.save(todo);
    }

    @DeleteMapping("/iD/{iD}")
    void delete(@PathVariable String iD) {
        ToDo itemToDelete = findByID(iD);
        manager.deleteItemByiD(itemToDelete.getID());

    }
}
