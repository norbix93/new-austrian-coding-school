package at.nacs.drhouse_accountancy.logic;

import at.nacs.drhouse_accountancy.dto.PatientDTO;
import at.nacs.drhouse_accountancy.persistence.Kind;
import at.nacs.drhouse_accountancy.persistence.invoice.Invoice;
import at.nacs.drhouse_accountancy.persistence.invoice.InvoiceRepository;
import at.nacs.drhouse_accountancy.persistence.patient.Patient;
import at.nacs.drhouse_accountancy.persistence.patient.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Accountant {

    private final PatientRepository patientRepository;
    private final InvoiceRepository invoiceRepository;
    private final Cashier cashier;

    private ModelMapper modelMapper = new ModelMapper();

    public Patient save(PatientDTO patientDTO) {
        Patient patient = convertToPatient(patientDTO);
        return patientRepository.save(patient);
    }

    private Patient convertToPatient(PatientDTO patientDTO) {
        Patient patient = modelMapper.map(patientDTO, Patient.class);
        patient.setUuid(patientDTO.getId());
        return patient;
    }

    public Invoice createInvoice(PatientDTO patientDTO) {
        Patient patient = modelMapper.map(patientDTO, Patient.class);
        Invoice invoice = Invoice.builder()
                .patient(patient)
                .kind(getKind(patientDTO))
                .symptoms(patientDTO.getSymptoms())
                .diagnosis(patientDTO.getDiagnosis())
                .provided(patientDTO.getTreatment())
                .cost(calculateCost(patientDTO))
                .paid(false)
                .timestamp(LocalDateTime.now())
                .build();
        return invoiceRepository.save(invoice);
    }

    public Double calculateCost(PatientDTO patientDTO) {
        if (getKind(patientDTO).equals(Kind.TREATMENT)) {
            return cashier.calculatePrice(patientDTO.getTreatment());
        }
        return cashier.calculatePrice(patientDTO.getMedicine());
    }

    Kind getKind(PatientDTO patientDTO) {
        if (Objects.nonNull(patientDTO.getTreatment())) {
            return Kind.TREATMENT;
        }
        return Kind.MEDICINE;
    }

    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    public Invoice pay(String id) {
        Optional<Invoice> invoice = invoiceRepository.findById(Long.valueOf(id));
        invoice.get().setPaid(true);
        return invoice.orElse(null);
    }
}
