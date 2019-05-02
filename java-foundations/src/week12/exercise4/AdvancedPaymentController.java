package week12.exercise4;

import java.util.List;
import java.util.stream.Collectors;

public class AdvancedPaymentController {

    //List<Payment> read as a list from PaymentReader

    public List<Integer> checkAdvancedPayment(List<Payment> payments) {
        return payments.stream()
                .filter(e -> !e.getEarning().equals(e.getBankPayment()))
                .map(Payment::getDay)
                .collect(Collectors.toList());
    }
}

