package week2.exercise4;

public class CarShopApplication {

    public static void main(String[] args) {

        Car bmw = new Car("BMW");
        Seller seller = new Seller();
        seller.describe(bmw);

        Car nissan = new Car("Nissan");
        seller.describe(nissan);

        Car toyota = new Car("Toyota");
        seller.describe(toyota);

    }
}
