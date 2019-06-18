package at.nacs.drhouse_accountancy.logic;

import at.nacs.drhouse_accountancy.dto.PatientDTO;
import at.nacs.drhouse_accountancy.logic.PatientManager;
import at.nacs.drhouse_accountancy.persistence.patient.Patient;
import at.nacs.drhouse_accountancy.persistence.patient.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class PatientManagerTest {

    @Autowired
    PatientManager patientManager;

    @MockBean
    PatientRepository repository;

    @Test
    void storePatient() {
        Patient testPatient = Patient.builder()
                .name("Anna")
                .build();

        patientManager.save(testPatient);

        verify(repository).save(testPatient);
    }

    @Test
    void convertToPatient() {
        PatientDTO patientDTO = PatientDTO.builder()
                .id("123")
                .name("Alex")
                .build();

        Patient patient = patientManager.convertToPatient(patientDTO);
        assertThat(patient.getUuid()).isEqualTo(patientDTO.getId());
        assertThat(patient.getName()).isEqualTo(patientDTO.getName());
    }
}