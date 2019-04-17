package at.nacs.drhouse_accountancy.communication;

import at.nacs.drhouse_accountancy.logic.InvoiceManager;
import at.nacs.drhouse_accountancy.persistence.invoice.Invoice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/invoices")
public class InvoicesEndpoint {

    private final InvoiceManager invoiceManager;

    @GetMapping
    List<Invoice> findAll() {
        return invoiceManager.findAllInvoices();
    }

    @PutMapping("{id}/paid")
    void put(@PathVariable String id) {
        invoiceManager.pay(id);
    }
}
