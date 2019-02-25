package week6.exercise5;

public class Credit {

    public String credit(Long cardNumber) {
        AmericanExpress americanExpress = new AmericanExpress();
        MasterCard masterCard = new MasterCard();
        Visa visa = new Visa();
        if (!americanExpress.validate(cardNumber).equals("INVALID")) {
            System.out.println("This card is an American Express!");

        } else if (!masterCard.validate(cardNumber).equals("INVALID")) {
            System.out.println("This card is a Mastercard!");
        } else if (!visa.validate(cardNumber).equals("INVALID")) {
            System.out.println("This card is a VISA card!");
        } else {
            System.out.println("INVALID CARD TYPE!");
        }

        return "";
    }

}

