package week6.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreditTest {

    @Test
    void credit() {
        AmericanExpress americanExpress = new AmericanExpress();
        MasterCard masterCard = new MasterCard();
        Visa visa = new Visa();
        String expectedMasterCard = "This is a MASTERCARD";
        String expectedVisa = "This is a VISA card";
        String expectedAmericanExpress = "This is an AMERICAN EXPRESS";
        String expectedInvalid = "INVALID";
        String actualMastercard = masterCard.validate(5182822463100000L);
        String actualVisa = visa.validate(4000000000000L);
        String actualAmericanExpress = americanExpress.validate(340000000000000L);

        Assertions.assertEquals(expectedAmericanExpress, actualAmericanExpress);
        Assertions.assertEquals(expectedMasterCard, actualMastercard);
        Assertions.assertEquals(expectedVisa, actualVisa);
    }
}
