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

    public void invoice(PatientDTO patientDTO) {
        Patient patient = patientManager.findOrCreate(patientDTO);
        invoiceManager.createInvoice(patientDTO, patient);
    }
}
