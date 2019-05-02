package at.nacs.drhousediagnosis.communication;

import at.nacs.drhousediagnosis.model.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PatientsEndpointTest {

    @Autowired
    PatientsEndpoint patientsEndpoint;

    @MockBean
    RestTemplate restTemplate;

    @Test
    void forward() {
        Patient patient = new Patient();
        Patient actual = patientsEndpoint.forward(patient);
        assertThat(actual).isNotNull();
        assertThat(actual.getId()).isNull();
        assertThat(actual.getDiagnosis()).isNotNull();
    }
}
