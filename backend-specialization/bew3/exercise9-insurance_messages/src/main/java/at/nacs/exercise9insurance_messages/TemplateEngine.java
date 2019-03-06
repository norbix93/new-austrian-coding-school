package at.nacs.exercise9insurance_messages;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TemplateEngine {

    private final CustomerLoader customerLoader;

    protected void createManTemplate() {
        List<Customer> customers = customerLoader.getCustomer();
        customers.stream()
                .filter(customer -> customer.getName().startsWith("Mr."))
                .forEach(maleCustomer ->
                        System.out.println(
                                "Good day " + maleCustomer.getName() +
                                        ", don’t forget our 20% discount on tickets this Friday!"));
    }

    protected void createFemaleTemplate() {
        List<Customer> customers = customerLoader.getCustomer();
        customers.stream()
                .filter(customer -> customer.getName().startsWith("Mrs.")
                        || customer.getName().startsWith("Ms."))
                .forEach(femaleCustomer ->
                        System.out.println(
                                "Dear " + femaleCustomer.getName() +
                                        ", you and your friends will have so " +
                                        "much fun at the cinema this Friday with a 20% discount!"));
    }

    protected void createPrivilegedTemplate() {
        List<Customer> customers = customerLoader.getCustomer();
        customers.stream()
                .filter(customer -> customer.getName().contains("Threepwood"))
                .forEach(privilegedCustomer ->
                        System.out.println(
                                "My dearest " + privilegedCustomer.getName() +
                                        ", your lovely family gives you a 20% discount on tickets this Friday!"));
    }

    protected void createDefaultTemplate() {
        List<Customer> customers = customerLoader.getCustomer();
        customers.stream()
                .filter(customer -> !customer.getName().contains("Threepwood")
                        && !customer.getName().startsWith("Mr.")
                        && !customer.getName().startsWith("Mrs.")
                        && !customer.getName().startsWith("Ms."))
                .forEach(customer ->
                        System.out.println(
                                "Hello " + customer.getName() +
                                        "! How about a Friday night movie? This week with a 20% discount!"));
    }
}
