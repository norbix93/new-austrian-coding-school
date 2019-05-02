package week6.exercise2;

public abstract class IceCream {

    String flavor;
    String topping;

    public IceCream(String flavor, String topping) {
        this.flavor = flavor;
        this.topping = topping;


    }

    public abstract String eat(String getFlavor, String getTopping);

    protected String getFlavor() {
        return flavor;
    }

    protected String getTopping() {
        return topping;
    }
}
