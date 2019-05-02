package week6.exercise5;


public class MasterCard extends CreditCard {

    @Override
    protected String validate(Long cardNumber) {
        String card = cardNumber.toString();
        Integer length = card.length();
        String firstTwoNumber = card.substring(0, 2);
        if ((length.equals(16)) && (firstTwoNumber.equals("51")) || (firstTwoNumber.equals("52")) ||
                (firstTwoNumber.equals("53")) || (firstTwoNumber.equals("54")) || (firstTwoNumber.equals("55")))
            return "This is a MASTERCARD";
        else return "INVALID";
    }
}
