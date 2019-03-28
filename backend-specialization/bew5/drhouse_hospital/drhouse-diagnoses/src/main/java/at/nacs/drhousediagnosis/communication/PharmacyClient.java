package at.nacs.drhousediagnosis.communication;

import at.nacs.drhousediagnosis.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class PharmacyClient {

    private final RestTemplate restTemplate;

    @Value("${pharmacy.port}")
    private String pharmacyPort;

    public Patient send(Patient patient) {
        return restTemplate.postForObject(pharmacyPort, patient, Patient.class);
    }

}
