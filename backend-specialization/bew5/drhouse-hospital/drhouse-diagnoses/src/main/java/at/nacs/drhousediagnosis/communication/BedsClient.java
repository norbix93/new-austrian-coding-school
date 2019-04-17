package at.nacs.drhousediagnosis.communication;

import at.nacs.drhousediagnosis.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class BedsClient {

    private final RestTemplate restTemplate;

    @Value("${beds.port}")
    private String bedsUrl;

    public Patient send(Patient patient) {
        return restTemplate.postForObject(bedsUrl, patient, Patient.class);
    }

}
