package at.nacs.exercise9insurance_messages.view;

import at.nacs.exercise9insurance_messages.controller.CustomerLoader;
import at.nacs.exercise9insurance_messages.controller.TemplateEngine;
import at.nacs.exercise9insurance_messages.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TextMessageSender {

    private final TemplateEngine engine;
    private final CustomerLoader customerLoader;

    public void display() {
        List<Customer> customers = customerLoader.getCustomer();
        engine.getMessage(customers);
    }
}
