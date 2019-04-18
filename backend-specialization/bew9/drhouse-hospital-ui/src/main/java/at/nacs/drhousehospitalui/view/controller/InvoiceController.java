package at.nacs.drhousehospitalui.view.controller;

import at.nacs.drhousehospitalui.communication.InvoicesClient;
import at.nacs.drhousehospitalui.view.model.Invoice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/invoices")
@RequiredArgsConstructor
public class InvoiceController {
    private final InvoicesClient client;

    @ModelAttribute("invoices")
    List<Invoice> invoices() {
        return client.findAll();
    }

    @ModelAttribute("invoice")
    Invoice invoice() {
        return new Invoice();
    }

    @GetMapping
    String page() {
        return "invoices";
    }

    @PostMapping("/paid")
    String pay(@RequestParam String id) {
        client.pay(id);
        return "redirect:/invoices";
    }
}
