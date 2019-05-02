package week6.exercise5;

public class Visa extends CreditCard {

    @Override
    protected String validate(Long cardNumber) {
        String card = cardNumber.toString();
        Integer length = card.length();
        String firstNumber = card.substring(0, 1);
        if ((length.equals(13) || length.equals(16)) && (firstNumber.equals("4"))) {
            return "This is a VISA card";
        } else
            return "INVALID";

    }
}
