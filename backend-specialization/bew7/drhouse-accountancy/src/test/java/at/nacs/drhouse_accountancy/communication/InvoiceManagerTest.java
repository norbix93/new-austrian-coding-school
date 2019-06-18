package at.nacs.drhouse_accountancy.communication;

import at.nacs.drhouse_accountancy.configuration.Cashier;
import at.nacs.drhouse_accountancy.dto.PatientDTO;
import at.nacs.drhouse_accountancy.logic.Accountant;
import at.nacs.drhouse_accountancy.logic.InvoiceManager;
import at.nacs.drhouse_accountancy.persistence.invoice.Invoice;
import at.nacs.drhouse_accountancy.persistence.invoice.InvoiceRepository;
import at.nacs.drhouse_accountancy.persistence.patient.Patient;
import at.nacs.drhouse_accountancy.persistence.patient.PatientRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class InvoiceManagerTest {

    @Autowired
    Accountant accountant;

    @Autowired
    Cashier cashier;

    @Autowired
    InvoiceManager invoiceManager;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    InvoiceRepository invoiceRepository;

    Patient patient;

    PatientDTO patientDTO;

    Invoice invoice;

    @BeforeEach
    void before() {
        patient = Patient.builder()
                .id(123L)
                .name("Maria")
                .uuid("1234")
                .build();
        patientRepository.save(patient);

        patientDTO = PatientDTO.builder()
                .id("123")
                .name("Juliana")
                .symptoms("headache")
                .diagnosis("migraine")
                .medicine("aspirin")
                .build();

        invoice = invoiceManager.createInvoice(patientDTO, patient);

    }

    @AfterEach
    void after() {
        patientRepository.deleteAll();
        invoiceRepository.deleteAll();
    }

    @Test
    void createInvoice() {

        Invoice expected = invoiceRepository.findById(invoice.getId()).orElse(null);

        assertThat(invoice.getCost()).isNotNull();
        assertThat(invoice.getDiagnosis()).isEqualTo(patientDTO.getDiagnosis());
        assertThat(invoice).isEqualToIgnoringGivenFields(expected, "patient","timestamp");
        assertThat(invoice.getId()).isNotNull();
        assertThat(invoice.getTimestamp()).isNotNull();
    }

    @Test
    void findAllInvoices() {
        List<Invoice> all = invoiceManager.findAllInvoices();
        assertThat(all.size()).isEqualTo(1);
    }

    @Test
    void pay() {
        assertThat(invoice.isPaid()).isFalse();

        Long id = invoice.getId();
        invoiceManager.pay(id.toString());

        Invoice actual = invoiceRepository.findById(id).get();
        assertThat(actual.isPaid()).isTrue();
    }

    @Test
    void calculateCost() {
    }
}