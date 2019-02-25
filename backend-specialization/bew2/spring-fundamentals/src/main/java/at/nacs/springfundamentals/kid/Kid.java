package at.nacs.springfundamentals.kid;

import org.springframework.stereotype.Component;

@Component
public class Kid {

    private Toy toy;

    public Kid(Toy toy) {
        this.toy = toy;
    }

    public String getFavouriteToyName() {
        return "My favourite toy is " + toy.getName();
    }
}
