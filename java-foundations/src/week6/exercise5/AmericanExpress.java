package week6.exercise5;


public class AmericanExpress extends CreditCard {


    @Override
    protected String validate(Long cardNumber) {
        String card = cardNumber.toString();
        Integer length = card.length();
        String firstTwoNumber = card.substring(0, 2);
        if (length.equals(15)) {
            if ((firstTwoNumber.equals("34")) || (firstTwoNumber.equals("37"))) {
                System.out.println("Card: " + card);
                return "This is an AMERICAN EXPRESS";
            }
        }
        return "INVALID";
    }

}



