package at.nacs.todoui.view.controller;

import at.nacs.todoui.communication.ToDoClient;
import at.nacs.todoui.view.model.ToDo;
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
    return client.findAll();
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
    client.save(toDo);
    return "redirect:/";
  }

  @PostMapping("/done")
  String markAsDone(@RequestParam String id) {
    client.sendToMarkAsDone(id);
    return "redirect:/";
  }
  @PostMapping("/delete")
  String deleteAll(@RequestParam String id){
    client.delete(id);
    return "redirect:/";
  }
}