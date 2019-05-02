package at.nacs.exercise9insurance_messages;

import at.nacs.exercise9insurance_messages.controller.CustomerLoader;
import at.nacs.exercise9insurance_messages.model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class CustomerLoaderTest {

    @Autowired
    CustomerLoader loader;

    @Test
    void getCustomer() {
        List<Customer> customers = loader.getCustomer();
        int expected = 22;
        Assertions.assertEquals(expected, customers.size());
    }
}