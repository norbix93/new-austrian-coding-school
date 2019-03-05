package at.nacs.exercise9insurance_messages;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TemplateEngine {
    private final CustomerLoader loader;

    public String createTemplate() {
        List<Customer> customers = loader.getCustomers();
        String customerName = "";
        for (int times = 0; times != customers.size(); times++) {
            for (Customer customer : customers) {
                customerName = customer.getName();
                if (customerName.contains("Mr.")) {
                    return "Good day " + customerName + ", don’t forget our 20% discount on tickets this Friday!";
                } else if (customerName.contains("Mrs.")) {
                    return "Dear " + customerName + ", you and your " +
                            "friends will have so much fun at the cinema this Friday with a 20% discount!";
                } else if (customerName.contains("Threepwood")) {
                    return "My dearest " + customerName + ", your lovely family gives you " +
                            "a 20% discount on tickets this Friday!";
                }
            }
        }
        return "Hello " + customerName + "! How about a Friday night movie? " +
                "This week with a 20% discount!";
    }
}
