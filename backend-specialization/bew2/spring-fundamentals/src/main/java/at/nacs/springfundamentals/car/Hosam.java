package at.nacs.springfundamentals.car;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Hosam {

    private final Car car;

    public String getCarColor() {
        return car.getColor();
    }

    public void setCarColor(String color) {
        car.setColor(color);
    }


}
