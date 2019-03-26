package at.nacs.todo_application.communication;

import at.nacs.todo_application.ToDoRepository;
import at.nacs.todo_application.model.ToDo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class ToDoEndpoint {
    private final ToDoRepository toDoRepository;

    @GetMapping("/{id}")
    ToDo get(@PathVariable String id) {
        return toDoRepository.findOneByid(id).orElse(null);
    }

    @GetMapping
    List<ToDo> todos() {
        return toDoRepository.findAll();
    }

    @PutMapping("/{id}/done")
    ToDo doToDo(@PathVariable String id) {
        ToDo itemToChange = toDoRepository.findOneByid(id).orElse(null);
        itemToChange.setDone(true);
        return toDoRepository.save(itemToChange);
    }

    @PostMapping
    ToDo receiveNewToDo(@RequestBody ToDo todo) {
        return toDoRepository.save(todo);
    }

    @DeleteMapping("/{id}")
    ToDo delete(@PathVariable String id) {
        return toDoRepository.deleteToDoByid(id).orElse(null);

    }
}
