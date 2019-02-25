package week3.exercise1;


public class Screen {


    public void displayName(Customer customer) {

        if (customer.getCategory().equals("business")) {
            System.out.println(customer.getName().toUpperCase());
        } else {
            System.out.println(customer.getName().toLowerCase());

        }


    }
}