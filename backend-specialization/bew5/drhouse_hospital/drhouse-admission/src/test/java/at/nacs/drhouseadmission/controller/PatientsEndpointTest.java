package at.nacs.drhouseadmission.controller;

import at.nacs.drhouseadmission.model.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PatientsEndpointTest {

    @Autowired
    PatientsEndpoint endpoint;

    @MockBean
    DiagnosisClient client;

    @Test
    void send() {
        Patient patient = new Patient();
        Patient actual = endpoint.send(patient);
        assertThat(actual.getId()).isNotNull();
        assertThat(actual.getName()).isNull();
        assertThat(actual.getSymptoms()).isNull();
    }
}