package at.nacs.drhouse_accountancy.communication;

import at.nacs.drhouse_accountancy.logic.Accountant;
import at.nacs.drhouse_accountancy.persistence.invoice.Invoice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.mockito.Mockito.verify;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class InvoicesEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    @MockBean
    Accountant accountant;

    Invoice invoice;

    String url = "/invoices";

    @Test
    void findAllInvoices() {
        restTemplate.getForObject(url, Invoice[].class);

        verify(accountant).findAll();
    }

    @Test
    void put() {
        String id = "thisID";
        String invoiceUrl = url + "/" + id + "/paid";

        restTemplate.put(invoiceUrl, void.class);

        verify(accountant).pay(id);
    }
}