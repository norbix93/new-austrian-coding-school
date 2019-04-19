package at.nacs.drhouse_accountancy.logic;

import at.nacs.drhouse_accountancy.dto.PatientDTO;
import at.nacs.drhouse_accountancy.persistence.patient.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Accountant {

    private final PatientManager patientManager;
    private final InvoiceManager invoiceManager;


    public PatientDTO invoice(PatientDTO patientDTO) {
        Patient patient = patientManager.convertToPatient(patientDTO);
        patientManager.save(patient);
        invoiceManager.createInvoice(patientDTO, patient);
        return patientDTO;
    }
}
