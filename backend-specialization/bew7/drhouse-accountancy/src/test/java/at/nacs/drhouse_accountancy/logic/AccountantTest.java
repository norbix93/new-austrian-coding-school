package at.nacs.drhouse_accountancy.logic;

import at.nacs.drhouse_accountancy.dto.PatientDTO;
import at.nacs.drhouse_accountancy.logic.Accountant;
import at.nacs.drhouse_accountancy.logic.InvoiceManager;
import at.nacs.drhouse_accountancy.logic.PatientManager;
import at.nacs.drhouse_accountancy.persistence.invoice.Invoice;
import at.nacs.drhouse_accountancy.persistence.patient.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class AccountantTest {

    @Autowired
    Accountant accountant;

    @MockBean
    InvoiceManager invoiceManager;

    @MockBean
    PatientManager patientManager;


    @Test
    void invoice() {

        PatientDTO patientDto = PatientDTO.builder()
                .id("123")
                .name("Anna")
                .build();

        Patient patient = Patient.builder()
                .id(789L)
                .uuid("123")
                .name("Anna")
                .build();

        Invoice testInvoice = new Invoice();
        when(invoiceManager.createInvoice(patientDto, patient)).thenReturn(testInvoice);
    }
}