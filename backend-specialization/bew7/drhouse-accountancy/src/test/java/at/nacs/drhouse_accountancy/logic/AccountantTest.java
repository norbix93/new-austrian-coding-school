package at.nacs.drhouse_accountancy.logic;

import at.nacs.drhouse_accountancy.dto.PatientDTO;
import at.nacs.drhouse_accountancy.persistence.invoice.Invoice;
import at.nacs.drhouse_accountancy.persistence.invoice.InvoiceRepository;
import at.nacs.drhouse_accountancy.persistence.patient.Patient;
import at.nacs.drhouse_accountancy.persistence.patient.PatientRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;
@SpringBootTest(webEnvironment = NONE)
class AccountantTest {

    @Autowired
    Accountant accountant;

    @Autowired
    Cashier cashier;

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
                .id(123L)           //maybe should be removed
                .name("Maria")
                .uuid("1234")
                .build();
        patientRepository.save(patient);

        patientDTO = PatientDTO.builder()
                .id("123")
                .name("Juliana")
                .symptoms("headache")
                .diagnosis("migraine")
                .medicine("aspirin")  //needs a case with treatment too
                .build();

    }

    @AfterEach
    void after() {
        patientRepository.deleteAll();
    }

    @Test
    void save() {
        accountant.save(patientDTO);
        Optional<Patient> actual = patientRepository.getPatientByUuid(patientDTO.getId());
        List<Patient> patients = patientRepository.findAll();

        assertThat(actual.isPresent()).isTrue();
        assertThat(patients.size()).isEqualTo(2);
        assertThat(actual).isNotNull();
    }

    @Test
    void calculateCost() {
        Double actual = accountant.calculateCost(patientDTO);

        assertThat(actual).isEqualTo(5.01);
    }

    @Test
    void createInvoice() {
        Invoice actual = accountant.createInvoice(patientDTO);
        List<Invoice> expected = invoiceRepository.findAll();

        assertThat(actual).isIn(expected);
    }

    @Test
    void findAll() {
        Invoice actual = accountant.createInvoice(patientDTO);
        System.out.println(actual);
        List<Invoice> expected = invoiceRepository.findAll();

        assertThat(actual).isIn(expected);
    }

    @Test
    void pay() {
    }
}