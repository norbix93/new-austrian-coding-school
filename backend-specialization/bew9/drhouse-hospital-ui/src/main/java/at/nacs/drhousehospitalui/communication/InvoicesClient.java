package at.nacs.drhousehospitalui.communication;

import at.nacs.drhousehospitalui.view.model.Invoice;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class InvoicesClient {

    private final RestTemplate restTemplate;

    @Value("${invoices.server.url}")
    private String url;

    public List<Invoice> findAll() {
        Invoice[] invoices = restTemplate.getForObject(url, Invoice[].class);
        return new ArrayList<>(Arrays.asList(invoices));
    }

    public void pay(String id) {
        restTemplate.put(url + "/" + id + "/paid", Invoice.class);
    }



}

