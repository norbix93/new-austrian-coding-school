package week3.exercise2;

import week3.exercise1.Customer;

public class InsuranceApplication {

    public static void main(String[] args) {
        TemplateChooser templateChooser = new TemplateChooser();
        Customer alexandra = new Customer("Ms. Alexandra", "woman");
        Customer robin = new Customer("Mr. Robin", "man");
        Customer martin = new Customer("Mr. Martin", "woman");
        templateChooser.chooseTemplate(alexandra);
        templateChooser.chooseTemplate(robin);
        templateChooser.chooseTemplate(martin);



    }
}
