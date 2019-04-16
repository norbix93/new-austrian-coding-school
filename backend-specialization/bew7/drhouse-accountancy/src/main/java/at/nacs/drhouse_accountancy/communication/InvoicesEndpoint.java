package at.nacs.drhouse_accountancy.communication;

import at.nacs.drhouse_accountancy.logic.Accountant;
import at.nacs.drhouse_accountancy.persistence.invoice.Invoice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/invoices")
public class InvoicesEndpoint {

    private final Accountant accountant;

    @GetMapping
    List<Invoice> findAllInvoices() {
        return accountant.findAll();
    }

    @PutMapping("{id}/paid")
    void put(@PathVariable String id) {
        accountant.pay(id);
    }
}
