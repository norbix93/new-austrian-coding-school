package week6.exercise3;

public class AutomaticCoffeeMachine extends CoffeeMaker {
    @Override
    public String getName() {
        return "Automatic coffee machine";

    }

    @Override
    public Integer getBrewingTime() {
        return 5;
    }

    @Override
    public String toString() {
        return "Automatic Coffee Machine";
    }
}
