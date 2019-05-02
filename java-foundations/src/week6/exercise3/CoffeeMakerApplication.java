package week6.exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakerApplication {

    public static void main(String[] args) {
        List<CoffeeMaker> listOfCoffeMakers = CoffeeMakers.asList();
        for (CoffeeMaker coffeeMaker : listOfCoffeMakers) {
            Coffee coffee = coffeeMaker.brew();
            System.out.println(coffeeMaker.getName() + " brewed a coffee and it took " + coffeeMaker.getBrewingTime() + " minutes.");
        }

        List<String> names = Arrays.asList("Automatic coffee machine", "Auto drip", "French press");
        for (String name : names) {
            Optional<CoffeeMaker> coffeeMaker = CoffeeMakers.get(name);
            if (coffeeMaker.isPresent()) {
                System.out.println(coffeeMaker.get() + " brewed a coffee and it took " + coffeeMaker.get().getBrewingTime() + " minutes.");
            }
        }

        Optional<CoffeeMaker> optionalCoffeeMaker = CoffeeMakers.get("Moka pot");
        if (!optionalCoffeeMaker.isPresent()) {
            System.out.println("The coffee maker with the name Moka pot is not available.");
        }

    }
}


