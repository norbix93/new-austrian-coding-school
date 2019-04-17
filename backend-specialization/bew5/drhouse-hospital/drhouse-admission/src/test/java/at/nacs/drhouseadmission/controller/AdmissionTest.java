package at.nacs.drhouseadmission.controller;

import at.nacs.drhouseadmission.communication.DiagnosisClient;
import at.nacs.drhouseadmission.model.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;


@SpringBootTest(webEnvironment = NONE)
public class AdmissionTest {

    @Autowired
    Admission admission;

    @MockBean
    DiagnosisClient client;

    @Test
    void admitTestWithID() {
        Patient patient = new Patient();
        admission.admit(patient);
        assertThat(patient.getId()).isNotNull();
    }

    @Test
    void admitTestWithOutID() {
        Patient patient = new Patient();
        assertThat(patient.getId()).isNull();
    }
}