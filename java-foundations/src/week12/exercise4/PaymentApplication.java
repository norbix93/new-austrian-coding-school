package week12.exercise4;

import java.util.List;

public class PaymentApplication {

    public static void main(String[] args) {
        PaymentController controller = new PaymentController();
        PaymentReader reader = new PaymentReader();
        AdvancedPaymentController advancedController = new AdvancedPaymentController();
        List<Payment> payments = reader.getListOfPayments("week12/exercise4/payments-lvl5.csv");
        /*Optional<Integer> integer = controller.checkPayment(payments);
        if (integer.isPresent()) {
            System.out.println("Output: "+ integer.get());
        }*/
        System.out.println("Output: " + advancedController.checkAdvancedPayment(payments));

    }
}
