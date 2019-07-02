package at.nacs.drhouse_accountancy.logic;

import at.nacs.drhouse_accountancy.dto.PatientDTO;
import at.nacs.drhouse_accountancy.persistence.patient.Patient;
import at.nacs.drhouse_accountancy.persistence.patient.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientManager {

    private final PatientRepository patientRepository;

    public Patient findOrCreate(PatientDTO patientDTO) {
    Optional<Patient> patient = findOneByUuid(patientDTO);
    if (patient.isPresent()) {
        return patient.get();
    }
    patient = findOneByName(patientDTO);
    if (patient.isPresent()) {
        return patient.get();
    }
    return createPatient(patientDTO);
}

    private Optional<Patient> findOneByUuid(PatientDTO patientDTO) {
        String uuid = patientDTO.getId();
        return patientRepository.findOneByUuid(uuid);
    }

    private Optional<Patient> findOneByName(PatientDTO patientDTO) {
        String name = patientDTO.getName();
        return patientRepository.findOneByName(name);
    }

    private Patient createPatient(PatientDTO patientDTO) {
        Patient patient = Patient.builder()
                .name(patientDTO.getName())
                .uuid(patientDTO.getId())
                .build();
        patientRepository.save(patient);
        return patient;
    }
}
