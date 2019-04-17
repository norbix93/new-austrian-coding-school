package at.nacs.encoderui.view.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Valid
public class ValidatedMessage {

  @NotEmpty
  private String text;

  @Override
  public String toString() {
    return text;
  }
}

