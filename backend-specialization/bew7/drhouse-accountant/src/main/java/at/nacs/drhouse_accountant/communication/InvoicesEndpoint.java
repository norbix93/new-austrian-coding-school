package at.nacs.drhouseaccountant.communication;

import at.nacs.drhouseaccountant.logic.Accountant;
import at.nacs.drhouseaccountant.persistence.Invoice;
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

    @PutMapping("/{id}/paid")
    void put(@PathVariable String id) {
        accountant.pay(id);
    }
}
