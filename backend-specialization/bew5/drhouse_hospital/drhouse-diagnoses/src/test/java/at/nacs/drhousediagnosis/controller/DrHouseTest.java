package at.nacs.drhousediagnosis.controller;

import at.nacs.drhousediagnosis.model.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class DrHouseTest {

    @Autowired
    DrHouse drHouse;

    @Test
    void createDiagnosisOne() {
        Patient patient = Patient.builder().symptoms("spots").build();
        Patient actual = drHouse.createDiagnosis(patient);
        String expected = "Chickenpox";
        assertThat(actual.getDiagnosis()).isEqualTo(expected);
    }
    @Test
    void createDiagnosisTwo(){
        Patient patient = Patient.builder().symptoms("virus").build();
        Patient actual = drHouse.createDiagnosis(patient);
        String expected = "Lupus";
        assertThat(actual.getDiagnosis()).isEqualTo(expected);
    }
}