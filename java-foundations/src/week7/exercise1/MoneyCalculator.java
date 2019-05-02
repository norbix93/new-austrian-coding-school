package week7.exercise1;


import java.util.List;

public class MoneyCalculator {

    protected Integer accumulateValue() {
        MoneyCollector moneyCollector = new MoneyCollector();
        moneyCollector.collectPayments();
        Integer sum = 0;
        List<Integer> collection = moneyCollector.collectPayments();
        System.out.println(collection);
        for (Integer payment : collection) {
            sum = sum + payment;
        }
        return sum;
    }
}

