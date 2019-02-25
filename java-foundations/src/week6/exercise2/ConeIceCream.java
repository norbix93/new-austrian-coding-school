package week6.exercise2;

public class ConeIceCream extends IceCream {


    public ConeIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public String eat(String getFlavor, String getTopping) {
        return "The " + flavor + " ice-cream with " + topping + " is licked.";
    }

    @Override
    public String toString() {
        return "The " + flavor + " ice-cream with " + topping + " is licked.";
    }
}

