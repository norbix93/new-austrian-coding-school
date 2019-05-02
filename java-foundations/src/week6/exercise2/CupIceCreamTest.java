package week6.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupIceCreamTest {

    @Test
    void eat() {
        String rightMessage = "The vanilla ice-cream with fruit cream is eaten with a spoon.";
        CupIceCream cupIceCream = new CupIceCream("vanilla ", "fruit cream");
        assertEquals(rightMessage, cupIceCream);

    }
}