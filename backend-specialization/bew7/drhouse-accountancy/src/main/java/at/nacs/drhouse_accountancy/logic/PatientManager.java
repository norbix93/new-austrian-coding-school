package at.nacs.drhouse_accountancy.logic;

import at.nacs.drhouse_accountancy.dto.PatientDTO;
import at.nacs.drhouse_accountancy.persistence.patient.Patient;
import at.nacs.drhouse_accountancy.persistence.patient.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientManager {

    private final PatientRepository patientRepository;

    public Patient convertToPatient(PatientDTO patientDTO) {
        return Patient.builder()
                .uuid(patientDTO.getId())
                .name(patientDTO.getName())
                .build();
    }

    public Patient save(Patient patient) {
        patientRepository.save(patient);
        return patient;
    }
}
