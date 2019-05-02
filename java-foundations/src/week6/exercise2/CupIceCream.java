package week6.exercise2;

public class CupIceCream extends IceCream {
    public CupIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public String eat(String getFlavor, String getTopping) {
        return "The " + flavor + "ice-cream with " + topping + " is eaten with a spoon.";
    }

    @Override
    public String toString() {
        return "The " + flavor + "ice-cream with " + topping + " is eaten with a spoon.";
    }
}
