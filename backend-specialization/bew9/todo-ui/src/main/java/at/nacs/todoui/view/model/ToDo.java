package at.nacs.todoui.view.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class ToDo {

  @NotEmpty
  private String title;

  private String id;

  private boolean done;
}
