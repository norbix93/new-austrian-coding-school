package week6.exercise3;

public abstract class CoffeeMaker {

    protected abstract String getName();

    protected abstract Integer getBrewingTime();


    protected Coffee brew() {
        Coffee coffee = new Coffee(getName(), getBrewingTime());
        return coffee;


    }


}



