package at.nacs.drhouse_accountancy.logic;

import at.nacs.drhouse_accountancy.configuration.Cashier;
import at.nacs.drhouse_accountancy.dto.PatientDTO;
import at.nacs.drhouse_accountancy.persistence.Kind;
import at.nacs.drhouse_accountancy.persistence.invoice.Invoice;
import at.nacs.drhouse_accountancy.persistence.invoice.InvoiceRepository;
import at.nacs.drhouse_accountancy.persistence.patient.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class InvoiceManager {

    private final InvoiceRepository invoiceRepository;
    private final Cashier cashier;

    public Invoice createInvoice(PatientDTO patientDTO, Patient patient) {
        Invoice invoice = Invoice.builder()
                .patient(patient)
                .kind(isMedicineOrTreatment(patientDTO))
                .symptoms(patientDTO.getSymptoms())
                .diagnosis(patientDTO.getDiagnosis())
                .provided(getMedicineOrTreatment(patientDTO))
                .cost(calculateCost(patientDTO))
                .paid(false)
                .timestamp(LocalDateTime.now())
                .build();
        invoiceRepository.save(invoice);
        return invoice;
    }

    Kind isMedicineOrTreatment(PatientDTO patientDTO) {
        if (Objects.equals(patientDTO.getTreatment(), null)) {
            return Kind.MEDICINE;
        }
        return Kind.TREATMENT;
    }

    String getMedicineOrTreatment(PatientDTO patientDTO) {
        if (Objects.equals(patientDTO.getTreatment(), null)) {
            return patientDTO.getMedicine();
        }
        return patientDTO.getTreatment();
    }

    public List<Invoice> findAllInvoices() {
        return invoiceRepository.findAll();
    }

    public Invoice pay(String id) {
        Invoice invoice = findById(id);
        invoice.setPaid(true);
        invoiceRepository.save(invoice);
        return invoice;
    }

    private Invoice findById(String inputId) {
        Long id = Long.valueOf(inputId);
        return invoiceRepository.findById(id).orElse(null);
    }

    public Double calculateCost(PatientDTO patientDTO) {
        if (isMedicineOrTreatment(patientDTO).equals(Kind.TREATMENT)) {
            return cashier.calculatePrice(patientDTO.getTreatment());
        }
        return cashier.calculatePrice(patientDTO.getMedicine());
    }
}
