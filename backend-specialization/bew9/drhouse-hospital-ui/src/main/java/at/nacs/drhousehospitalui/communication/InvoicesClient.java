package at.nacs.drhousehospitalui.communication;

import at.nacs.drhousehospitalui.view.model.Invoice;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class InvoicesClient {

    private final RestTemplate restTemplate;

    @Value("${invoices.url}")
    private String invoicesUrl;

    @Value("${invoices.paid.url}")
    private String paidUrl;

    public List<Invoice> findAll() {
        Invoice[] invoices = restTemplate.getForObject(invoicesUrl, Invoice[].class);
        return new ArrayList<>(Arrays.asList(invoices));
    }

    public void pay(Long id) {
        restTemplate.put(paidUrl, null, Map.of("id", id));
    }
}

