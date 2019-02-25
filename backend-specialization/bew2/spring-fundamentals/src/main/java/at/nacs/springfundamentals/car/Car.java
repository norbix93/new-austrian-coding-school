package at.nacs.springfundamentals.car;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
@Scope("prototype")
@Data
public class Car {

    private String color;

    public Car() {
        List<String> colors = List.of("red", "white", "black");
        int position = new Random().nextInt(colors.size());
        this.color = colors.get(position);
    }

}
