package week3.exercise2;

import week3.exercise1.Customer;

public class TemplateChooser {

    public void chooseTemplate(Customer customer){

        if (customer.getName().startsWith("Mr.")){
            System.out.println(customer.getName()+ " is a man.");
        } else if (customer.getName().startsWith("Ms.")){
            System.out.println(customer.getName()+ " is a woman.");
        } else if (customer.getName().endsWith("Hokopoko")) {
            System.out.println(customer.getName()+ " is privileged.");
        } else {
            System.out.println(customer.getName()+ " is default.");
        }
}
}
