package week6.exercise3;

public class AutoDrip extends CoffeeMaker
{
    @Override
    public String getName() {
        return "Auto drip";
    }

    @Override
    public Integer getBrewingTime() {
        return 6;
    }

    @Override
    public String toString() {
        return "AutoDrip";
    }
}
