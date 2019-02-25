package week6.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {

    public static List<CoffeeMaker> asList() {
        List<CoffeeMaker> listOfCoffeeMakers = new ArrayList<>();
        FrenchPress frenchPress = new FrenchPress();
        AutoDrip autoDrip = new AutoDrip();
        AutomaticCoffeeMachine automaticCoffeeMachine = new AutomaticCoffeeMachine();
        listOfCoffeeMakers.add(frenchPress);
        listOfCoffeeMakers.add(automaticCoffeeMachine);
        listOfCoffeeMakers.add(autoDrip);
        return listOfCoffeeMakers;
    }

    public static Optional<CoffeeMaker> get(String coffeeMaker) {

        for (CoffeeMaker coffeMaker : asList()) {
            if (coffeMaker.getName().equalsIgnoreCase(coffeeMaker))
                return Optional.of(coffeMaker);
        }
        return Optional.empty();

    }

}



