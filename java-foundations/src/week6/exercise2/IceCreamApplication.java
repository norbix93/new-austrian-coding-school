package week6.exercise2;

public class IceCreamApplication {
    public static void main(String[] args) {
        ConeIceCream coneIceCream = new ConeIceCream("chocolate", "nuts");
        CupIceCream cupIceCream = new CupIceCream("vanilla", "fruit cream");
        System.out.println(coneIceCream);
        System.out.println(cupIceCream);
    }
}
