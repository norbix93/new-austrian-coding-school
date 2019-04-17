package at.nacs.todoui.controller;

import at.nacs.todoui.communication.ToDoClient;
import at.nacs.todoui.model.ToDo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class ToDoController {

  private final ToDoClient client;

  @ModelAttribute("todos")
  List<ToDo> todos() {
    return client.getAllToDos();
  }

  @ModelAttribute("todo")
  ToDo todo() {
    return new ToDo();
  }

  @GetMapping
  String page() {
    return "todos";
  }

  @PostMapping
  String post(@Valid ToDo toDo, BindingResult result) {
    if (result.hasErrors()) {
      return page();
    }
    ToDo savedToDo = client.sendToSave(toDo);
    toDo.setTitle(savedToDo.getTitle());
    toDo.setId(savedToDo.getId());
    toDo.setDone(savedToDo.isDone());
    return "redirect:/";
  }

  @PostMapping("/done")
  String markAsDone(@RequestParam String id) {
    client.sendToMarkAsDone(id);
    return "redirect:/";
  }
  @PostMapping("/delete")
  void deleteAll(@RequestParam String id){
    client.delete(id);
  }
}