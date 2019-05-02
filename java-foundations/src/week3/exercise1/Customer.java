package week3.exercise1;

public class Customer {

    public String name;
    public String category;

    public Customer (String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }
}
