package week12.exercise4;

import java.util.List;
import java.util.stream.Collectors;

public class PaymentReader {

    protected List<Payment> getListOfPayments(String filePath) {
        FileReader reader = new FileReader();
        return reader.asStream(filePath)
                .map(column -> column.split(" "))
                .map(columns -> new Payment(Integer.valueOf(columns[1]), Double.valueOf(columns[2]),
                        Double.valueOf(columns[5])))
                .collect(Collectors.toList());
    }
}
