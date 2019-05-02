package week3.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScreenTest {

    @Test
    void testBusinessCustomer() {

        Customer customer = new Customer("Adib", "Business");
        assertEquals("Business", customer.getCategory());

    }

    @Test
    void testEconomyCustomer() {

        Customer customer = new Customer("Norbert", "Economy");
        assertEquals("Economy", customer.getCategory());
    }

}