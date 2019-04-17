package at.nacs.todoui.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
public class ToDo {

  @NotEmpty
  private String title;

  private String id;

  private boolean done;
}
